package WhileLoop;

import java.util.Scanner;

public class Problem1 {

    /*
    Kullanicidan kac sayi toplamak istedigini alin
    bu sayilari alin ve toplamlarini yazdirin
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen kac tane sayiyi toplamak istediginizi yaziniz");
        int sayiAdedi = scan.nextInt();

        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami: " + toplam);

        //while ile yaparsak:

        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac<=sayiAdedi){
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac ++;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami: " + toplam);
    }
}
