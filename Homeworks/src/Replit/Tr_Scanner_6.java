package Replit;

import java.util.Scanner;

public class Tr_Scanner_6 {
    //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        float sayi = scan.nextFloat();

        short sayi2 = (short) sayi;

        System.out.println(sayi2);
    }
}
