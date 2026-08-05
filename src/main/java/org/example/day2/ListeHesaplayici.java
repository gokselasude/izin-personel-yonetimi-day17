package org.example.day2;

public class ListeHesaplayici {
    public static void main(String[] args) {
        int[] sayilar = {15, 25, 35, 45, 55, 65, 75};
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        double ortalama = (double) toplam / sayilar.length;

        System.out.println("Listedeki sayıların toplamı: " + toplam);
        System.out.println("Listedeki sayıların ortalaması: " + ortalama);
    }
}