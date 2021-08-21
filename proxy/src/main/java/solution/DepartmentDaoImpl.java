package solution;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDaoImpl implements DepartmentDao {

    private final DBConnection dbConnection;

    public DepartmentDaoImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void insertNerDepartment(int id, String name) throws SQLException {
        Connection  connection = dbConnection.getConnection();
        try(PreparedStatement statement = connection.prepareStatement("insert into departments values(?,?)")){
            statement.setInt(1, id);
            statement.setString(2,name);
            statement.executeUpdate();
        }

    }

    @Override
    public String getDepartmentName(int id) throws SQLException {
        Connection connection = dbConnection.getConnection();
        String result = null;
        try(PreparedStatement statement = connection.prepareStatement("select Department_Name from departments where id=?")) {
           statement.setInt(1,id);
           try(ResultSet resultSet = statement.executeQuery()) {
             if(resultSet.next()){
                result = resultSet.getString(1);
             }
           }
        }
        return result;
    }

    @Override
    public Connection getConnection() {
        return dbConnection.getConnection();
    }
}
