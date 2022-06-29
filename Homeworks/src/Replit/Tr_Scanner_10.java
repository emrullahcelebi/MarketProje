package Replit;

import java.util.Scanner;

public class Tr_Scanner_10 {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

    INPUT:

    Dakika sayısı: 3456789

    OUTPUT :

    3456789 dakika yaklaşık 6 yıl 210 gündür
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Kac dk hesaplansin?");
        long dakika = scan.nextLong();

        long gun = dakika/1440;
        long yil = gun/365;
        gun = gun-yil*365;

        System.out.println(dakika + " dakika yaklasik "+ yil + " yil "+ gun + " gundur");
    }
}
