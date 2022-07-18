package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Random rnd = new Random();

        List<String> kullaniciAdlari = new ArrayList<String>();
        kullaniciAdlari.add("Muhammet");
        kullaniciAdlari.add("Mami");
        kullaniciAdlari.add("muhammet");
        kullaniciAdlari.add("mami");
        kullaniciAdlari.add("Topcu");

        System.out.println("Lutfen kullanici adi giriniz");
        String isim = scan.nextLine();

        isim = isim.replaceAll(" ", "");

        if (kullaniciAdlari.contains(isim)){
            isim += rnd.nextInt(100);
            System.out.println("Kullanici adi zaten alinmis. Yeni kullanici adiniz: " + isim);
        } else {
            System.out.println("Kullanici adiniz basariyla kaydedildi");
        }

    }
}
