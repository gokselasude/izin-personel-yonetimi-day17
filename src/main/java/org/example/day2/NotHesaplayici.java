package org.example.day2;

import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        double vizeNotu = scanner.nextDouble();

        System.out.print("Final notunuzu giriniz: ");
        double finalNotu = scanner.nextDouble();

        double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
        System.out.println("Yıl sonu ortalamanız: " + ortalama);

        harfNotuHesapla(ortalama);
    }

    public static void harfNotuHesapla(double ortalama) {
        if (ortalama >= 90) {
            System.out.println("Harf Notunuz: AA - Geçtiniz");
        } else if (ortalama >= 80) {
            System.out.println("Harf Notunuz: BA - Geçtiniz");
        } else if (ortalama >= 70) {
            System.out.println("Harf Notunuz: BB - Geçtiniz");
        } else if (ortalama >= 60) {
            System.out.println("Harf Notunuz: CB - Geçtiniz");
        } else if (ortalama >= 50) {
            System.out.println("Harf Notunuz: CC - Geçtiniz");
        } else {
            System.out.println("Harf Notunuz: FF - Kaldınız");
        }
    }
}