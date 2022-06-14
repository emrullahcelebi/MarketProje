package day01_variables;

import java.util.Scanner;

public class OrnekSoru2 {
    public static void main(String[] args) {
        // Kullanicidan karenin 1 kenar uzunlugunu iste. Karenin alanini ve cevresini hesapla
        Scanner scan= new Scanner(System.in);

        System.out.println("Kenar uzunlugunu giriniz:");
        double kenar= scan.nextDouble();
        System.out.println("Karenin cevresi: " + (4*kenar));
        System.out.println("Karenin alani: " + (kenar*kenar));
    }
}
