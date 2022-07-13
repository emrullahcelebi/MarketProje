package day4_practice;

import java.util.Scanner;

public class Q03_MethodCreation {
       /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
       public static void main(String[] args) {
           Scanner scan  = new Scanner(System.in);

           System.out.println("Lutfen 47den kucuk pozitif bir tamsayi giriniz");
           int sayi = scan.nextInt();

           String fib = fibonacciOlustur(sayi);
           System.out.println(fib);
       }

    public static String fibonacciOlustur(int sayi) {
           String fibo = "0-1";
           int son1 = 0, son2=1, toplam=0;


        for (int i = 1; i <=sayi; i++) {
            toplam = son1+son2;
            son1 = son2;
            son2=toplam;
            fibo +="-" +toplam;
        }
           return fibo;
    }
}
