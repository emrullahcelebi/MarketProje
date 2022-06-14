package Day02_scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        //String kullaniciIsmi = scan.next(); // sadece ilk kelimeyi alir

        String kullaniciIsmi = scan.nextLine();// satir sonuna kadar hepsini alir

        System.out.println("Kullanicinin girdigi isim: " + kullaniciIsmi);

    }
}
