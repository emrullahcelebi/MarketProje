package Text;

import java.util.Scanner;

public class Soru4 {
    /*
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Birinci binary sayiyi girin");
        int sayi1 = scan.nextInt();

        System.out.println("Ikinci binary sayiyi girin");
        int sayi2 = scan.nextInt();

        int onluk1 = binaryHesaplama(sayi1);
        int onluk2 = binaryHesaplama(sayi2);
        int toplam = onluk1+onluk2;

        int toplamBinary = onlukCevirme(toplam);
        System.out.println(toplamBinary);

    }

    private static int onlukCevirme(int toplam) {
        String str = "";
        while (toplam>0) {
            str= (toplam % 2)+ str;
            toplam/=2;
        }
        int toplamBn = (int) Double.parseDouble(str);
        return toplamBn;
    }

    private static int binaryHesaplama(int sayi) {
        int onluk = 0;
        int basamak = 1;

        while (sayi>0) {
            onluk += (sayi % 10) * (basamak);
            basamak *= 2;
            sayi /= 10;
        }
        return onluk;
    }
}
