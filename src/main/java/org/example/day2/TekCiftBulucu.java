package org.example.day2;

import java.util.Scanner;

public class TekCiftBulucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir çift sayıdır.");
        } else {
            System.out.println(sayi + " bir tek sayıdır.");
        }
    }
}