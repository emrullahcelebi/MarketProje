package WhileLoop;

import java.util.Scanner;

public class Problem8 {
    //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam= 0;

        while (sayi>0) {
            toplam += sayi%10;
            sayi/=10;
        }
        System.out.println("Rakamlar toplami: " + toplam);
    }
}
