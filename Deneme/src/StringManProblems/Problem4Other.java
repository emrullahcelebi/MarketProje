package StringManProblems;

import java.util.Scanner;

public class Problem4Other {
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

        boolean ilkHarf = false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkHarf = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonHarf = false;

        if ( sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf = true;
        } else {
            System.out.println("Sifrenizin sonu kucuk harf olmali");
        }

        boolean bosluk = false;

        if (!sifre.contains(" ")){
            bosluk = true;
        } else {
            System.out.println("Sifreniz bosluk icermemeli");
        }

        boolean uzunluk = false;

        if (sifre.length()>=8){
            uzunluk = true;
        } else {
            System.out.println("Sifreniz en az 8 karakterden olusmali");
        }

        if (ilkHarf&&sonHarf&&bosluk&&uzunluk){
            System.out.println("Sifre basari ile tanimlandi");
        }

    }
}
