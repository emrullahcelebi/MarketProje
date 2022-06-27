package recap;

import java.util.Scanner;

public class Q04_NotHesaplama {
    /*
     * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen ilk vize notunuzu giriniz");
        double vize1 = scan.nextDouble();

        System.out.println("Lutfen ikinci vize notunuzu giriniz");
        double vize2 = scan.nextDouble();

        System.out.println("Lutfen final notunuzu giriniz");
        double finl = scan.nextDouble();

        double vizeOrt = (vize1 + vize2)/2;
        double gecme = (vizeOrt*3 + finl*7)/10;

        if (vize1<0 || vize2<0 || finl<0 || vize1>100 || vize2>100 || finl>100) {
            System.out.println("Lutfen gecerli not giriniz");
        } else {
            System.out.println("Gecme notunuz: " + gecme);
        }
    }
}
