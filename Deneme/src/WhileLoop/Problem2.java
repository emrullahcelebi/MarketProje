package WhileLoop;

import java.util.Scanner;

public class Problem2 {
    /* Kullanicidan toplamak istedigi sayilari alin ve kullanici 0`a basana kadar devam edin
    kullanici 0`a bastiginda girdigi tum sayilarin toplamini yazdirin */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int sayi =0;
        int toplam = 0;

        for (int i = 1; i <100000 ; i++) { // kac sayi girecegini bilemiyoruz cunku
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi==0) {
                break;
            } else {
                toplam+=sayi;
            }
        }
        System.out.println("sayilarin toplami: " + toplam);

        //************************************************************************************************

        sayi=1;
        toplam=0;

        while (sayi!=0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("sayilarin toplami: " + toplam);
    }
}
