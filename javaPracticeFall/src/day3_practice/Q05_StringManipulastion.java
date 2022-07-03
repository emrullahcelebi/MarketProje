package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine().trim();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine().trim();

        if (isim.length()==soyIsim.length()){
            System.out.println(" Isim ve soyisim esit uzunlukta");
        } else {
            System.out.println(isim.length()>soyIsim.length() ?
                    "Isminiz daha uzun" : "Soyisminiz daha uzun");
        }
    }
}
