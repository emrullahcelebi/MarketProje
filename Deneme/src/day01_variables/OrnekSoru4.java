package day01_variables;

import java.util.Scanner;

public class OrnekSoru4 {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        // hacmini yazdirin

        Scanner sckisa= new Scanner(System.in);
        Scanner scuzun= new Scanner(System.in);
        Scanner scyukseklik= new Scanner(System.in);

        System.out.println("Kisa kenar uzunlugunu giriniz:");
        double kisa= sckisa.nextDouble();

        System.out.println("Uzun kenar uzunlugunu giriniz:");
        double uzun= scuzun.nextDouble();

        System.out.println("Yuksekligi giriniz: ");
        double yukseklik= scyukseklik.nextDouble();

        System.out.println("Prizmanin hacmi: " + (kisa*uzun*yukseklik));
    }
}
