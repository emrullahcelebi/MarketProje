package WhileLoop;

import java.util.Scanner;

public class Problem6 {
    // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
    //ve kac tane olduklarini ekrana yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int bolen = 2;
        String bolenler = "1";
        int sayac= 0;

        while (bolen<=sayi) {
            if (sayi%bolen==0){
                sayac++;
                bolenler+= " "+ bolen;
            }
            bolen++;
        }
        System.out.println(sayi + "`in " + sayac + " tane boleni var. Bunlar: " + bolenler);
    }
}
