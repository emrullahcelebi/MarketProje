package StringManupilation;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class IndexOfOrnek2 {

    public static void main(String[] args) {

        /* Kullanicidan bir cumle ve bir kelime girmesini isteyin. Kelimenin cumledeki kullanimina bakarak:
        "Girilen kelime cumlede kullanilmamis"
        "Girilen kelime cumlede 1 kere kullanilmis"
        "Girilen kelime cumlede 1`den fazla kullanilmis" yazdirin */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scan.nextLine().toLowerCase();

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();

        if (cumle.indexOf(kelime)==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (cumle.indexOf(kelime, cumle.indexOf(kelime)+1)==-1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1`den fazla kullanilmis");
        }
    }
}
