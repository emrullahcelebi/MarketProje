package StringManProblems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        //Kullanicidan isim ve soy ismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine().trim();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyad = scan.nextLine().trim();

        if (isim.length()>soyad.length()){
            System.out.println("Isminiz soyisimden daha uzun");
        } else if (soyad.length()>isim.length()) {
            System.out.println("Soyisminiz isminizden uzun");
        } else {
            System.out.println("Isim ve soyisminiz esit uzunlukta");
        }
    }
}
