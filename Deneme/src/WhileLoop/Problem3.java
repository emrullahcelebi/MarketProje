package WhileLoop;

import java.util.Scanner;

public class Problem3 {
    /*
    Kullanicidan istedigi kadar sayi girmesini isteyin
    kullanicinin girdigi sayilarin toplami 500`u gecerse
    "Artik yeter cok sayi girdin, toplam ... oldu" yazsin
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;

        while (toplam<500) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam +=sayi;
        }
        System.out.println("Artik yeter cok sayi girdin, toplam " + toplam + " oldu");
    }
}
