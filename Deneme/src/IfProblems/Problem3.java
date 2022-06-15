package IfProblems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        // Kullanicidan bir gunun ilk harfini isteyin ve o harfle baslayan gunleri yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen gunun ilk harfini giriniz:");
        char harf= scan.next().charAt(0);

        if (harf=='p' || harf=='P'){
            System.out.println("Pazartesi, Persembe, Pazar");
        }

        if (harf=='s' || harf=='S'){
            System.out.println("Sali");
        }

        if (harf=='c' || harf=='C'){
            System.out.println("Carsamba, Cuma, Cumartesi");
        }
    }
}
