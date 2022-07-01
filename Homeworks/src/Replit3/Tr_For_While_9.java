package Replit3;

import java.util.Scanner;

public class Tr_For_While_9 {
    /*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
    Input :1238
    Output :Girilen Numananin Tersi: 8321
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

       int sayi = scan.nextInt();
       int ters = 0;

       while (!(sayi<=0)){
            ters += sayi%10;
            sayi/=10;
            ters*=10;

        }
       ters/=10;
       System.out.println("Girilen Numananin Tersi: " + ters);
    }
}
