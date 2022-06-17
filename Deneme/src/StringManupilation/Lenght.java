package StringManupilation;

import java.util.Locale;
import java.util.Scanner;

public class Lenght {

    public static void main(String[] args) {

        // Kullanıcıdan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        int sira = isim.length();

        System.out.println("Ilk harf: " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0)
                + "\nSon Harf: " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(sira-1));
    }
}
