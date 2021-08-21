package Sample1;

public class EmployeeDtoAdapter extends Employee {
    private EmployeeDto employeeDto;

    public EmployeeDtoAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public String getFullName() {
        return employeeDto.getName() + " " + employeeDto.getFamily();
    }

    @Override
    public String getNationalCode() {
        return employeeDto.getNationalId();
    }
}
