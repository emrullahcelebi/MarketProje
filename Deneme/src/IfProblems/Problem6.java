package IfProblems;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        /* Kullanicidan 100 uzerinden not isteyin. Notu harf sistemine cevirip yazdirin.
        50den kucukse D, 50-60 arasi C, 60-80 arasi B, 80-100 arasi ise A. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz:");

        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Gecersiz not girdiniz");
        } else if (not<50){
            System.out.println("Notunuz: D");
        } else if (not<60) {
            System.out.println("Notunuz: C");
        } else if (not<80) {
            System.out.println("Notunuz: B");
        } else {
            System.out.println("Notunuz: A");
        }
    }
}
