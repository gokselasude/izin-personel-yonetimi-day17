package org.example.domain;

public class Employee extends Person {
    private String employeeNumber;
    private Department department;

    public Employee(Long id, String firstName, String lastName, String email, String employeeNumber, Department department) {
        super(id, firstName, lastName, email);
        this.employeeNumber = employeeNumber;
        this.department = department;
    }

    public Employee() {
        super();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}