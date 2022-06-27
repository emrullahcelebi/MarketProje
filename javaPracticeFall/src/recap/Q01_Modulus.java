package recap;

import java.util.Scanner;

public class Q01_Modulus {

    /*  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *   Ex :
     *   input  : 12345
     *   output : 12  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int bas5 = sayi%10;
        sayi = sayi/10;

        int bas4 = sayi%10;
        sayi = sayi/10;

        int bas3 = sayi%10;
        sayi = sayi/10;

        int bas2 = sayi%10;
        sayi = sayi/10;
        int bas1 = sayi;

        if (sayi<=0 || sayi>=10) {
            System.out.println("Sayi 5 basamakli degil");
        } else {
            int toplam = bas1 + bas2 + bas4 + bas5;
            System.out.println(toplam);
        }
    }
}
