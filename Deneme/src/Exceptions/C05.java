package Exceptions;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Kullanicidan yasini girmesini isteyin.
        0`dan kucukse Exc verecek sekilde yazin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi girin");
        int yas = scan.nextInt();

        try {
            if (yas<0) {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas icin negatif deger giremezsiniz");
        }
        System.out.println(yas);

        Thread.sleep(5000); // 5 saniye bekletecek

        throw new RuntimeException("Buraya hata koyduk"); // Exception olarak parantez icini yazar

    }
}
