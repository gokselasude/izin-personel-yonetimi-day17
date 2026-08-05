package org.example.day2;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tahmin = 0;
        int denemeSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum. Hadi tahmin et!");

        while (tahmin != rastgeleSayi) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı giriniz.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı giriniz.");
            } else {
                System.out.println("Tebrikler! " + denemeSayisi + ". denemede doğru bildiniz.");
            }
        }
    }
}