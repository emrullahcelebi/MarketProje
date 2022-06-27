package recap;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        if (yas<0 || yas>120 || kilo<0 || kilo>350){
            System.out.println("Lutfen girdiginiz bilgileri kontrol edin");
        } else if (yas<18){
            System.out.println("kan bagisi yapamaz");
        } else {
            System.out.println(kilo<50 ? "kan bagisi yapamaz" : "kan bagisi yapabilir");
        }
    }
}
