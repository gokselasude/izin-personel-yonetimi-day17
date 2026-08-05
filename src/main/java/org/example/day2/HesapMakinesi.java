package org.example.day2;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlemi seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            case '/':
                if (sayi2 != 0) {
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Hata: Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz.");
        }
    }
}