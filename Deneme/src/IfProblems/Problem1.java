package IfProblems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin ve tek mi cift mi oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");

        int sayi= scan.nextInt();

        sayi=sayi%2;

        if (sayi==0){
            System.out.println("Sayiniz cift");
        } else {
            System.out.println("Sayiniz tek");
        }
    }
}
