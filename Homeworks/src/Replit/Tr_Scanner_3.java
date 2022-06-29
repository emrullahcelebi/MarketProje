package Replit;

import java.util.Scanner;

public class Tr_Scanner_3 {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

    Örnek Çıktı:

    Alan: 32

    Çevre: 24
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Dikdortgenin bir kenar uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        System.out.println("Dikdortgenin diger kenar uzunlugunu giriniz");
        int kenar2 = scan.nextInt();

        System.out.println("Alan: " + kenar1*kenar2);
        System.out.println("Cevre: " + (kenar1+kenar2)*2);

    }
}
