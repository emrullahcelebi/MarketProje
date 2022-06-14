package day01_variables;

import java.util.Scanner;

public class OrnekSoru5 {
    public static void main(String[] args) {
        // Kullanicidan ismini isteyip isminin bas harfini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Isminizi giriniz:");
        char ilkharf= scan.next().charAt(0);
        System.out.println("Isminizin ilk harfi: " + ilkharf);
    }
}
