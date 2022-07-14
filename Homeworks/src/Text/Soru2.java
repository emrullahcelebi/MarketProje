package Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2 {
    /*
     Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
     Sayı sisteminde,  ugly number asal faktörleri sadece 2, 3 veya 5 olan pozitif sayılardır.
      İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

      Test Data:  13
      Beklenen çıktı: ugly number  degildir
      Test Data:  25
    Beklenen Çıktı:  ugly number
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> asalBolenler = new ArrayList<Integer>();
        asalBolenler = asalCarpanlaraAyir(sayi);

        Integer sayi2 = 2, sayi3 = 3, sayi5= 5;
        if (sayi==1 || sayi==sayi2 || sayi==sayi3 || sayi==sayi5) {
            System.out.println("ugly number");
        } else if (asalBolenler.size()==0){
            System.out.println("ugly number  degildir");
        } else {
            asalBolenler.remove(sayi2);
            asalBolenler.remove(sayi3);
            asalBolenler.remove(sayi5);
            System.out.println(asalBolenler.isEmpty() ? "ugly number" : "ugly number degildir");
        }
    }

    public static List<Integer> asalCarpanlaraAyir(int sayi) {
        List<Integer> asalBolenler = new ArrayList<Integer>();
        int bolen = 2;
        int sayiC=sayi;
        while (bolen <= sayi) {
            if (sayi%bolen == 0) {
                asalBolenler.add(bolen);
                sayi/= bolen;
            } else bolen++;
        }
        if (asalBolenler.contains(sayiC)) { asalBolenler.clear();
        }
        asalBolenler = tekrarsizListeOlustur(asalBolenler);
        return asalBolenler;
    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList = new ArrayList<Integer>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))) {
                tekrarsizList.add(sayilar.get(i));
            }
        }

        return tekrarsizList;
    }
}
