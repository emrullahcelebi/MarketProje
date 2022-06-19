package StringManProblems;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        /* Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        "Sifre basari ile tanimlandi" saglamiyorsa "islem basarisiz, lutfen yeni bir sifre yazin" yazdirin
        - Ilk harf buyuk olmali
        - Son harf kucuk olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();

        boolean ilkharf = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
        boolean sonharf = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        boolean bosluk = !sifre.contains(" ");
        boolean uzunluk = sifre.length()>=8;

        System.out.println(ilkharf&&sonharf&&bosluk&&uzunluk ?
               "Sifre basari ile tanimlandi":
              "islem basarisiz, lutfen yeni bir sifre yazin");
    }
}
