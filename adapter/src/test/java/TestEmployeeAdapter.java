
import Sample1.EmployeeDao;
import Sample1.EmployeeDto;
import Sample1.EmployeeDtoAdapter;
import org.junit.Test;


class TestEmployeeAdapter {

    @Test
    public void test(){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.save(new EmployeeDtoAdapter(new EmployeeDto()));
    }
}
