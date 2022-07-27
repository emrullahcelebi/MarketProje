package W3resource;

import Text.Soru4;

import java.util.Scanner;

public class Q2 {
    /*
    Bir tamsayi kabul edecek ve onu binary sayiya donusturecek bir Java programi yazin.
    Ardindan binary sayida kac tane 0 oldugunu yazdirin.
    Beklenen cikti:
    ilk sayiyi girin: 25
    25'in ikili gosterimi: 11001
    Toplam 0 sayisi: 2
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();

        int binSayi = Soru4.onlukCevirme(sayi);
        int binSayiC = binSayi;

        int sifir = 0;

        while (binSayiC>50){
            if (binSayiC%10==0) sifir++;
            binSayiC/=10;
        }
        System.out.println(sayi + "`in ikili gosterimi: " + binSayi);
        System.out.println("Toplam 0 sayisi: " + sifir);
    }
}
