package MatematikselIslemler;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        // kullanicidan alinan 4 basamakli bir sayinin
        // basamaklar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        sayi=(int)sayi/10;
        rakam=sayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        sayi=(int)sayi/10;
        rakam=sayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        sayi=(int)sayi/10;
        rakamlarToplami=rakamlarToplami+sayi;

        System.out.println("Basamaklar toplami: " + rakamlarToplami);
    }
}
