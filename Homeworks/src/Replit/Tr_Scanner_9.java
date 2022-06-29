package Replit;

import java.util.Scanner;

public class Tr_Scanner_9 {
    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.

    Örnek Çıktı:

    1 saat 10 dakika 50 saniye ==>

    4250 saniye
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Saat giriniz");
        int saat = scan.nextInt();

        System.out.println("Dakika giriniz");
        int dakika = scan.nextInt();

        System.out.println("Saniye giriniz");
        int saniye = scan.nextInt();

        System.out.println((saat*3600+dakika*60+saniye) +" saniye");
    }
}
