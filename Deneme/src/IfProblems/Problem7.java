package IfProblems;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {

        /* Kullanicidan 2 sayi isteyin. Sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin.
        sayilarin ikisi de negatif ise sayilarin carpimini yazdirin
        sayilar farkli isarete sahipse "Farkli isaretli sayilarla islem yapamazsin" yazdirin
        sayilardan 0 a esit olan varsa "0 carpmaya gore yutan elemandir" yazdirin */

        Scanner scan1= new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan1.nextDouble();
        double sayi2= scan1.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Sayilarin toplami: " + (sayi1 + sayi2));
        } else if (sayi1*sayi2<0) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("Sayilarin carpimi: " + (sayi1*sayi2));
        } else {
            System.out.println("0 carpmaya gore yutan elemandir");
        }
    }
}
