package Replit;

import java.util.Scanner;

public class Tr_Scanner_4 {
    /*
    Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını
    hesaplayın ve yazdırın.

    1 şeker = 1.7 gr

    Örnek Çıktı:

    Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Gunde kac kez cay iciyorsunuz?");
        int cay = scan.nextInt();

        System.out.println("Cayiniza kac seker atiyorsunuz?");
        int seker = scan.nextInt();

        System.out.println("1 Yilda "+ cay*seker*0.365*1.7 +" kg seker kullaniyor");

    }
}
