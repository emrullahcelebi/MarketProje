package FreeWork;

import java.util.Scanner;

public class Q8 {
    /*
    Kullanicidan alinan bir tamsayinin baska bir tamsayinin karesi olup olmadigini kontrol eden bir Java programi yazin.
Ornek input: 25
Beklenen output: 25 tamkare bir sayidir
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        boolean sonuc = false;

        for (int i = 0; i <=sayi/2 ; i++) {
            if (i*i==sayi) {
                sonuc = true;
                break;
            }
        }
        System.out.println(sonuc ? sayi + " tamkare bir sayidir" : sayi + " tamkare bir sayi degildir");
    }
}
