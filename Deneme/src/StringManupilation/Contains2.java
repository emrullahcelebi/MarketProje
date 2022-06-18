package StringManupilation;

import java.util.Scanner;

public class Contains2 {

    public static void main(String[] args) {

        /* Kullanicidan bir cumle isteyin. cumle:
        "Buyuk" iceriyorsa buyuk harflerle
        "Kucuk" iceriyorsa kucuk harflerle tum cumleyi yazdirin.
        ikisi de yoksa "Cumle buyuk ya da kucuk kelimesi icermiyor"
        ikisi de varsa "Cumle buyuk ve kucuk kelimelerinin ikisini de iceriyor" yazdirin. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scan.nextLine();

        if (cumle.toUpperCase().contains("BUYUK")){
            if (cumle.toUpperCase().contains("KUCUK")){
                System.out.println("Cumle buyuk ve kucuk kelimelerinin ikisini de iceriyor");
            } else {
                System.out.println(cumle.toUpperCase());
            }
        } else if (cumle.toUpperCase().contains("KUCUK")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
        }
    }
}
