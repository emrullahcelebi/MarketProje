package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_7 {
    // isim1 çift sayıda karakter içeriyorsa,
    // ikinci kelimeyi ilk adın ortasına yerleştirin
    // ilk kelime tek sayida karakter iceriyorsa
    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String isim1 = scan.next();
        String isim2 = scan.next();

        if (isim1.length()%2==0) {
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
        } else {
            System.out.println("isim1, isim2 ye eklenemiyor.");
        }
    }
}
