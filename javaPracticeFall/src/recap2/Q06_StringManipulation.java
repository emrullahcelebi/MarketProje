package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen ilk kelimeyi giriniz");
        String kelime1 = scan.nextLine();

        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String kelime2 = scan.nextLine();

        String birlesim1 = kelime1.concat(kelime2);

        System.out.println(birlesim1);

/* ********************************************************************************************************************* */

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerin ilk harflerini atip birlestiriniz.

        String birlesim2 = kelime1.substring(1).concat(kelime2.substring(1));

        System.out.println(birlesim2);
    }
}
