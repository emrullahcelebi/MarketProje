package Replit7;

import java.util.Scanner;

public class Conditional_Statement_12 {
    /*
    Ugly Number:
    Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
    İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int sayi = sc.nextInt();

        while (sayi>1) {
            if (sayi%2==0) {
                sayi/=2;
            } else if (sayi%3==0) {
                sayi/=3;
            } else if (sayi%5==0) {
                sayi/=5;
            } else {
                System.out.println("Ugly number degildir");
                break;
            }
        }
        if (sayi==1){
            System.out.println("Ugly number");
        }

    }
}
