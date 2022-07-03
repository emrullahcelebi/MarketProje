package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length()!=4) {
            System.out.println("Lutfen 4 harfli bir kelime girin");
        } else {
            for (int i = kelime.length()-1; i >=0 ; i--) {
                System.out.print(kelime.charAt(i));
            }
        }
    }

}
