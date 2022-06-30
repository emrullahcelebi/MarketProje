package Replit3;

import java.util.Scanner;

public class Tr_For_While_2 {
    /*
    Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
    ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
    Input :
        30
        40
    Beklenen Cikti:
        30 ve 40 icin GCD = 10
        30 ve 40 icin LCM = 120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sayi3 = sayi1;
        int sayi4 = sayi2;

        int ebob = 1;
        int ekok = 1;

        for (int i = 1; i<=sayi3 && i<=sayi4; i++) {
            if (sayi3%i==0 && sayi4%i==0) ebob=i;
        }

        ekok = (sayi1*sayi2)/ebob;

        System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " icin LCM = " + ekok);
    }
}
