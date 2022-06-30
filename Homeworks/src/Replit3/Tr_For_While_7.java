package Replit3;

import java.util.Scanner;

public class Tr_For_While_7 {
    /*
    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
    Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.

    Input : 6

    Output: 6 Mukemmel Sayidir.
    */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int sayi = scan.nextInt();
        int bolen = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0) bolen+=i;
        }
        System.out.println(sayi==bolen ? sayi + " Mukemmel Sayidir." : sayi + " Mukemmel Sayidir degildir.");
    }
}
