package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {
    /*
    String sifre = "JavaGuzel123"
    Kullanicidan yukaridaki sifreyi girmesini isteyin. Dogru sifreyi yazana kadar
    tekrar tekrar isteyin. Dogru yazinca "Sifreniz kabul edildi" yazdirin
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String sifre = "JavaGuzel123";

        System.out.println("Lutfen sifrenizi giriniz");
        String sifreDeneme = scan.next();

        while (!sifre.equals(sifreDeneme)) {
            System.out.println("Hatali sifre, tekrar deneyin");
            sifreDeneme = scan.next();
        }
        System.out.println("Sifreniz kabul edildi");
    }


}
