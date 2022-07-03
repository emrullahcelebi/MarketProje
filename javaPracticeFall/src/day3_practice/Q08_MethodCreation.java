package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
     public static void main(String[] args) {
         Scanner scan  = new Scanner(System.in);

         System.out.println("sayi1`i giriniz");
         double sayi1 = scan.nextDouble();
         System.out.println("sayi2`yi giriniz");
         double sayi2 = scan.nextDouble();
         System.out.println("Hangi islem yapilsin? (+ - * /)");
         char islem = scan.next().charAt(0);

         if (islem == '+') {
             System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
         } else if (islem == '-') {
             System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
         } else if (islem == '*') {
             System.out.println(sayi1 + " x " + sayi2 + " = " + (sayi1*sayi2));
         } else if (islem == '/') {
             System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
         } else System.out.println("Gecersiz islem");
     }
}
