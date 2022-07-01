package DoWhileLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Problem2 {
    //Klavyeden alınan integer tipli bir sayının asal olup olmadığını test eden Java programını yazınız.
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi giriniz.");
        int sayi = scan.nextInt();
        int bolen = 2;
        int carpanSayisi = 0;

        if (sayi<=1){
            System.out.println("Bu sayida asal olup olmadigi aranmaz");
        } else {
            do {
                if (sayi % bolen == 0) {
                    carpanSayisi++;
                }
                bolen++;
            } while (bolen < sayi);
        }
        if (carpanSayisi == 0) {
            System.out.println("Sayi asal");
        }else System.out.println("Sayi asal degil");


    }
}
