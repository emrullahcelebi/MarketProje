package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        /* Marketteki urunleri bir arrayde tuttgumuzu varsayalim
        Kullaniciya index sorup o indexteki urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exc vermesinin onune gecelim
         */
        Scanner scan;

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        System.out.println("Istediginiz urunun sira nosunu girin");

        int istenenSira = 0;


        boolean kontrol = true;
        while (kontrol) {
             scan= new Scanner(System.in);
            try {
                istenenSira = scan.nextInt();
                kontrol = false;
            } catch (InputMismatchException e) {
                System.out.println("Urun indexi icin bir tamsayi girilmeli");
            }
        }
        /*
        catch parantezinin icindeki e veriable oluyor.
        eger yakalanan exc ile ilgili bilgileri kullaniciya vermek isterseniz bu veriable kullanilir
        */

        try {
            System.out.println("Urununuz: " + urunler[istenenSira - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listede yok" + "\nGirilen sira en fazla " + urunler.length + " olabilir");
        }
    }
}
