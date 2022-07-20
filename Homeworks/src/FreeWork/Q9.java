package FreeWork;

import java.util.Scanner;

public class Q9 {
    /*
    Kullanicidan alinan bir tamsayinin baska iki sayinin karelerinin toplami olup olmadigini kontrol eden bir Java programi yazin
    Ornek input: 97         (16+81=97)
    Beklenen output: true
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        boolean sonuc = false;
        for (int i = 1; i < sayi/2; i++) {
            for (int j = 1; j <sayi/2; j++) {
                if (i*i+j*j == sayi) sonuc = true;
            }
        }
        System.out.println(sonuc);
    }
}
