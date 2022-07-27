package Replit7;

import java.util.Scanner;

public class Conditional_Statement_10 {
    /*
    5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
     */

    public static int faktoriyel(int sayi){
        int faktoriyel = 1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    public static int kombinasyon(int sayi1, int sayi2){
        int kombinasyon = faktoriyel(sayi1)/(faktoriyel(sayi1-sayi2)*faktoriyel(sayi2));
        return kombinasyon;
    }
    public static void main(String[] args) {
        int satir = 5;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < satir-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(kombinasyon(i,j) + " ");
            }
            System.out.println("");
        }
    }
}
