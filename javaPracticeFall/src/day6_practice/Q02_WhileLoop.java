package day6_practice;

import java.util.Scanner;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
     public static void main(String[] args) {
         Scanner scan  = new Scanner(System.in);

         System.out.println("Pozitif bir tamsayi giriniz");
         int sayi = scan.nextInt();

         int sayac = 0;
         while (sayac<=sayi){
             if (sayac%2!=0) System.out.print(sayac + " ");
             sayac++;
         }
     }
}
