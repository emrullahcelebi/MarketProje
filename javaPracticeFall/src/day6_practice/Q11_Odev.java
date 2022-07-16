package day6_practice;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("PIN kodu olusturun");
        String pin = scan.nextLine();

        if (!pin.replaceAll("\\d", "").isEmpty()) {
            System.out.println("Pin sadece rakamlardan olusmalidir");
        } else {
            System.out.println("PIN basariyla olusturuldu \nLutfen Pin kodunuzu giriniz");
            String pinTekrar = scan.next();
            System.out.println(pinTekrar.equals(pin) ? "Sifre dogru" : "Sifre yanlis");
        }

    }
}
