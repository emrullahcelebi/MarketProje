package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen ilk kelimeyi girin");
        String kelime1 = scan.next();
        System.out.println("Lutfen ikinci kelimeyi girin");
        String kelime2 = scan.next();
        System.out.println("Lutfen ucuncu kelimeyi girin");
        String kelime3 = scan.next();
        System.out.println("Lutfen dorduncu kelimeyi girin");
        String kelime4 = scan.next();

        String cumle = kelime1.concat(" "+ kelime2 + " " + kelime3 + " " + kelime4 + ".");

        System.out.println("cumle = " + cumle);
    }
}
