package TernaryProblems;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        /* Kullanicidan harf girmesini isteyin. Girdigi harf:
        Buyukse "Buyuk Harf"
        Kucukse "Kucuk Harf"
        Harf degilse "Girdiginiz karakter harf degil" yazdirin.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? "kucuk harf" :
                (harf>='A' && harf<='Z' ? "Buyuk harf" : "Girdiginiz karakter harf degil"));
    }
}
