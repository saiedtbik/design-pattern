package solution;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class DepartmentDaoImplTest {

    private DBConnection dbConnection;
    private DepartmentDao departmentDao;

    @Before
    public void setUp() throws Exception {
    dbConnection = new DBConnection();
    dbConnection.openConnection();
    dbConnection.createTables();
    departmentDao = new DepartmentDaoImpl(dbConnection);
    }
    @Test
    public void test() throws SQLException {
        DepartmentDao daoProxy = TransactionProxy.createTransactionProxy(departmentDao);
        daoProxy.insertNerDepartment(1,"Department1");
        dbConnection.getConnection().rollback();
        assertEquals("Department1", departmentDao.getDepartmentName(1));
    }
}