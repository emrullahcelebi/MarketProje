package day6_practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        int toplam = 0;
        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Rakamlar toplami = " + toplam);
    }
}
