package ForLoop;

import java.util.Scanner;

public class Problem11 {
    // Kullanicidan 2 sayi isteyip sayilar ve aralarindaki sayilari toplayin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen kucuk sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen buyuk sayiyi giriniz");
        int sayi2 = scan.nextInt();

        int toplam = 0;

        for (int i = sayi1; i <= sayi2; i++) {
            toplam = toplam + i;
        }

        System.out.println("toplam = " + toplam);
    }
}
