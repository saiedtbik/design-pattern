package solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DBConnection {
    private Connection connection;
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());

    public DBConnection() {
        try {
            Class.forName("org.h2.Driver");
        }catch (ClassNotFoundException e){
            LOGGER.severe(e.getMessage());
            throw new IllegalStateException("Please Load Database Driver", e);
        }
    }
    public Connection openConnection() throws Exception{
         this.connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FALSE", "sa", "");
          connection.setAutoCommit(false);
          LOGGER.info("Connection established successfully.");
         return connection;
    }
    public void createTables() throws SQLException {
        try(Statement st = connection.createStatement()){
            st.execute("create Table  IF Not EXISTS  DEPARTMENTS(Id integer  not null, Department_Name varchar(255), primary key(Id))");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException{
       if(connection != null){
           connection.close();
       }else{
           LOGGER.severe("connection is null, Close Failed");
       }
    }
}
