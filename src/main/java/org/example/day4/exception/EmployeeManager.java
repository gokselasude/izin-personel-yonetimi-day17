package org.example.day4;

import org.example.day4.exception.DuplicateEmployeeException;
import org.example.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final List<Employee> employeeList = new ArrayList<>();

    // Personel Ekleme
    public void addEmployee(Employee employee) {
        for (Employee emp : employeeList) {
            if (emp.getId().equals(employee.getId())) {
                throw new DuplicateEmployeeException("Bu ID'ye sahip personel zaten mevcut: " + employee.getId());
            }
        }
        employeeList.add(employee);
        System.out.println("Personel başarıyla eklendi: " + employee.getFirstName() + " " + employee.getLastName());
    }

    // Tüm Personelleri Listeleme
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Departmana Göre Personel Filtreleme
    public List<Employee> getEmployeesByDepartment(String departmentName) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getDepartment() != null && emp.getDepartment().getName().equalsIgnoreCase(departmentName)) {
                filteredList.add(emp);
            }
        }
        return filteredList;
    }
}