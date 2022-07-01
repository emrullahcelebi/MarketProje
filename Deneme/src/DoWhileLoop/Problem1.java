package DoWhileLoop;

import java.util.Scanner;

public class Problem1 {
    /*
    Kullanicidan pozitif sayilar girmesini isteyin. Islemi bitirmek icin 0`a basmasini soyleyin
    Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayin
    ve "Negatif sayi giremezsiniz" yazdirip basa donun.
    Kullanici 0`a bastiginda kac pozitif sayi girdigini,
    yanlislikla kac negatif sayi girdigini
    ve girdigi pozitif sayilarin toplamini yazdirin
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int pozitifSayac = 0;
        int negatifSayac = 0;

        do {
            System.out.println("Lutfen pozitif tam sayi giriniz. Islemi bitirmek icin 0`a basin");
            sayi=scan.nextInt();
            if (sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
                negatifSayac++;
            } else if (sayi>0) {
                toplam+=sayi;
                pozitifSayac++;
            }
        }while (sayi!=0);

        System.out.println("Toplam "+pozitifSayac+" pozitif sayinin toplami: "+toplam);
        if (negatifSayac!=0)System.out.println("Toplam "+ negatifSayac+" negatif sayi girdiniz");
    }
}
