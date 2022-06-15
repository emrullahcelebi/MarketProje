package IfProblems;

import java.util.Scanner;

public class Problem2Else {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gunu giriniz");

        String gun= scan.next().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi"))
        {
            System.out.println("Girdiginiz gun haftasonu");
        } else {
            System.out.println("Girdiginiz gun haftaici");
        }
    }
}
