package connecttion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;


    static {
        dbConnection = new DBConnection();
    }

    private DBConnection() {
        initialConnection();
    }

    public static DBConnection getInstance() {
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }

    private void initialConnection() {
        try {
            Class.forName(DBConnectionInfo.DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DBConnectionInfo.CONNECTION, DBConnectionInfo.USER, DBConnectionInfo.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
