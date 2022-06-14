package day01_variables;

import java.util.Scanner;

public class OrnekSoru1 {
    public static void main(String[] args) {
        // kullanicidan 2 tamsayi alip toplam, fark ve carpimlarini yazdirin
        Scanner scan1= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);

        System.out.println("Sayi1`i giriniz:");
        int sayi1= scan1.nextInt();

        System.out.println("Sayi2`yi giriniz:");
        int sayi2= scan2.nextInt();

        System.out.println("Toplamlari: " + (sayi1+sayi2));
        System.out.println("Farklari: " + (sayi1-sayi2));
        System.out.println("Carpimlari: " + (sayi1*sayi2));

    }
}
