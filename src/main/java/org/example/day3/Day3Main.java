package org.example.day3;

import org.example.domain.*;

import java.time.LocalDate;

public class Day3Main {
    public static void main(String[] args) {
        // Departman nesnesi
        Department dept = new Department(1L, "Yazılım Geliştirme", "DEV");

        // Personel nesnesi
        Employee emp = new Employee(101L, "Göksel", "Aslan", "goksel@example.com", "EMP-001", dept);

        // İzin türü nesnesi
        LeaveType annualLeave = new LeaveType(1L, "Yıllık İzin", "Personelin yıllık izin hakkı", 14);

        // İzin talebi nesnesi
        LeaveRequest request = new LeaveRequest(
                1L,
                emp,
                annualLeave,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                "PENDING"
        );

        // Ekrana yazdırma
        System.out.println("=== İZİN YÖNETİM SİSTEMİ 3. GÜN TESTİ ===");
        System.out.println("Personel: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Departman: " + emp.getDepartment().getName());
        System.out.println("İzin Türü: " + request.getLeaveType().getName());
        System.out.println("Durum: " + request.getStatus());
    }
}