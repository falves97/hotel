package model.entities;

public class Employee extends Person {
    private EmployeeType employeeType;

    public Employee() {
        super();
    }

    public Employee(String name, String lastName, EmployeeType employeeType) {
        super(name, lastName);
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
