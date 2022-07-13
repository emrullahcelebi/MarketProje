package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {
          Scanner scan  = new Scanner(System.in);

          System.out.println("Lutfen cm cinsinden uzunluk giriniz");
          int uzunluk = scan.nextInt();

          double metre = uzunlukDonustur(uzunluk);
          int km = metreKmDonustur(metre);
          if (km>=1) metre=metre-km*1000;

          System.out.println(km>=1 ? km + " km, " + metre + " metre" : metre +" metre");
      }

    private static int metreKmDonustur(double metre) {
          int km =0;
          if (metre/1000>=1){
              km=(int) metre/1000;
          }
          return km;
    }

    private static double uzunlukDonustur(int uzunluk) {
          return (double) uzunluk/100;
    }
}
