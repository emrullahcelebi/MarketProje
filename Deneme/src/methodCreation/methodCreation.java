package methodCreation;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {

        /* Kullanicidan bir kelime isteyin. Eger kelime:
        3 harften kisaysa "Kelime cok kisa"
        3,4,5 harfliyse harf sayisini ve kelimenin tersten yazilisini
        5 harften uzunsa "Kelime cok uzun" yazdirin    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayisi = kelime.length();
        
        if (harfSayisi<3){
            System.out.println("Kelime cok kisa");
        } else if (harfSayisi==3) {
            System.out.println("Harf sayisi 3");
            ucHarfiTersineCevir(kelime);
        } else if (harfSayisi==4) {
            System.out.println("Harf sayisi 4");
            dortHarfiTersineCevir(kelime);
        } else if (harfSayisi==5) {
            System.out.println("Harf sayisi 5");
            besHarfiTersineCevir(kelime);
        }else {
            System.out.println("Kelime cok uzun");
        }
    }

    private static void besHarfiTersineCevir(String kelime) {
        System.out.println(kelime.substring(4)
                + kelime.substring(3,4)
                + kelime.substring(2,3)
                + kelime.substring(1,2)
                + kelime.substring(0,1));
    }

    private static void dortHarfiTersineCevir(String kelime) {
        System.out.println(kelime.substring(3)
                + kelime.substring(2,3)
                + kelime.substring(1,2)
                + kelime.substring(0,1));
    }

    private static void ucHarfiTersineCevir(String kelime) {
        System.out.println(kelime.substring(2)
                + kelime.substring(1,2)
                + kelime.substring(0,1));
    }
}
