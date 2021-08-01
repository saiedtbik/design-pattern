package connecttion;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {

    @Test
    void getConnection() {

        DBConnection dbConnection = DBConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        String createQuery = "CREATE TABLE PERSON(id int primary key, name varchar(20), family varchar(20))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String insertQuery = "INSERT INTO PERSON(id, name, family) VALUES(?, ? , ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Saied");
            preparedStatement.setString(3,"Talebi");
            preparedStatement.executeUpdate();


            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Ali");
            preparedStatement.setString(3,"Gholami");

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String readQuery = "SELECT * FROM PERSON ";
        try (Statement st = connection.createStatement()) {
            ResultSet resultSet = st.executeQuery(readQuery);
            while (resultSet.next()){
                String name = resultSet.getString(2);
                String family = resultSet.getString(3);
                System.out.println("NAME :" + name + " FAMILY : " + family);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String countQuery = "SELECT COUNT(*) FROM PERSON ";
        try (Statement st = connection.createStatement()) {
            ResultSet resultSet = st.executeQuery(countQuery);
            if(resultSet.next()){
                System.out.println("Count is : " + resultSet.getInt(1));
               assertEquals(2, resultSet.getInt(1) );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    void performanceTest(){
        Long startTime = System.currentTimeMillis();
        DBConnection dbConnection = DBConnection.getInstance();
        Long lastTime = System.currentTimeMillis();
        System.out.println("DurationTime : " + (lastTime - startTime));


        startTime = System.currentTimeMillis();
        dbConnection = DBConnection.getInstance();
        lastTime = System.currentTimeMillis();
        System.out.println("DurationTime2 : " + (lastTime - startTime));


    }
}