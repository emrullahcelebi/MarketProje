package Replit;

import java.util.Scanner;

public class Tr_Scanner_8 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

    Örnek Çıktı:

    Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int sayi = scan.nextInt();

        int basToplam = sayi%10 + sayi/10%10 + sayi/100;

        System.out.println("Verilen tamsayinin rakamlari toplami " + basToplam+"`dur");
    }
}
