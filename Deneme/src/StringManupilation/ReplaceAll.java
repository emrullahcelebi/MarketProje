package StringManupilation;

import java.util.Scanner;

public class ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan isim-soyisim bilgisi alip butun harfleri * yapalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi yaziniz");
        String isim = scan.nextLine();

        System.out.println(isim.replaceAll("\\S", "*"));
    }
}
