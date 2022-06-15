package IfProblems;

import java.util.Locale;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gunu giriniz");

        String gun= scan.next().toLowerCase(); // Alinan isim tamamen kucuk harfe cevirilecek

        //String ifadelerde == kullanilmaz cunku bekledigimizden farkli sonuclar verebilir

        if (gun.equals("pazar") || gun.equals("cumartesi"))
        {
            System.out.println("Girdiginiz gun haftasonu");
        }

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("Girdiginiz gun haftaici");
        }
    }
}
