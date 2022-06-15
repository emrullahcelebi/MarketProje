package IfProblems;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve kare
        //olup olmadigini yazdirin

        Scanner scan1= new Scanner(System.in);
        System.out.println("Lutfen 1. kenari giriniz:");
        double kenar1= scan1.nextDouble();

        Scanner scan2= new Scanner(System.in);
        System.out.println("Lutfen 2. kenari giriniz");
        double kenar2= scan2.nextDouble();

        if (kenar1==kenar2){
            System.out.println("Sekil bir karedir");
        } else {
            System.out.println("Sekil bir kare degildir");
        }
    }
}
