package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Problem5 {
    /*
    Bilgisayara 1-100 arasi random sayi tutturun
    Kullanicidan bu sayiyi tahmin etmesini isteyin
    girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    kullanici sayiyi buldugunda kac tahminde buldugunu yazdirin
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aklimdan 100`den kucuk bir sayi tuttum hadi tahmin et :)");
        long sayi = rand.nextLong(100);
        int tahmin = scan.nextInt();
        int tahminSayisi = 1;

        while (sayi!=tahmin) {
            if (sayi>tahmin) {
                System.out.println("Bilemedin daha buyuktu :) Tekrar dene bakalim:");
                tahmin = scan.nextInt();
                tahminSayisi++;
            } else {
                System.out.println("Bilemedin daha kucuktu :) Tekrar dene bakalim:");
                tahmin = scan.nextInt();
                tahminSayisi++;
            }
        }
        System.out.println("Sonunda " + tahminSayisi + " tahminde bulabildin, TEBRIKLER :)");
    }
}
