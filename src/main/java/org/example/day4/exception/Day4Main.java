package org.example.day4.exception;

import org.example.day4.EmployeeManager;
import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.domain.LeaveRequest;

import java.util.List;

public class Day4Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        LeaveManager leaveManager = new LeaveManager();

        // 1. Departman Oluştur
        Department itDept = new Department();
        itDept.setId(1L);
        itDept.setName("IT");

        Department hrDept = new Department();
        hrDept.setId(2L);
        hrDept.setName("IK");

        // 2. Personel Oluştur
        Employee emp1 = new Employee();
        emp1.setId(101L);
        emp1.setFirstName("Ahmet");
        emp1.setLastName("Yılmaz");
        emp1.setDepartment(itDept);

        Employee emp2 = new Employee();
        emp2.setId(102L);
        emp2.setFirstName("Ayşe");
        emp2.setLastName("Demir");
        emp2.setDepartment(hrDept);

        // 3. Personel Ekleme ve Mükerrer Kayıt (Exception) Testi
        System.out.println("--- Personel Ekleme Testi ---");
        try {
            employeeManager.addEmployee(emp1);
            employeeManager.addEmployee(emp2);

            System.out.println("\n--- Aynı Personeli Tekrar Ekleme Testi ---");
            // emp1'i tekrar eklemeye çalışıyoruz (Hata fırlatması bekleniyor)
            employeeManager.addEmployee(emp1);

        } catch (DuplicateEmployeeException e) {
            System.err.println("Yakalanan Hata: " + e.getMessage());
        }

        // 4. Departmana Göre Filtreleme Testi
        System.out.println("\n--- IT Departmanı Çalışanları ---");
        List<Employee> itEmployees = employeeManager.getEmployeesByDepartment("IT");
        for (Employee e : itEmployees) {
            System.out.println("Çalışan: " + e.getFirstName() + " " + e.getLastName());
        }

        // 5. İzin Talebi ve Duruma Göre Filtreleme Testi
        System.out.println("\n--- İzin Talepleri Testi ---");
        LeaveRequest req1 = new LeaveRequest();
        req1.setId(1L);
        req1.setStatus("BEKLIYOR");

        LeaveRequest req2 = new LeaveRequest();
        req2.setId(2L);
        req2.setStatus("ONAYLANDI");

        leaveManager.addLeaveRequest(req1);
        leaveManager.addLeaveRequest(req2);

        System.out.println("\n--- Bekleyen İzin Talepleri ---");
        List<LeaveRequest> pendingRequests = leaveManager.getRequestsByStatus("BEKLIYOR");
        System.out.println("Bekleyen talep sayısı: " + pendingRequests.size());
    }
}