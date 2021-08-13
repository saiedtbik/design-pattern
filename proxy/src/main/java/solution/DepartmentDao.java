package solution;

import java.sql.Connection;
import java.sql.SQLException;
public interface DepartmentDao {
    Connection getConnection();
    void insertNerDepartment(int id, String name) throws SQLException;
    String getDepartmentName(int id)throws SQLException;

}
