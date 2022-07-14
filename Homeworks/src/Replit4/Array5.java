package Replit4;

import java.util.Arrays;

public class Array5 {
    /*
    yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:**True**
    Aranan Değer:2010
    Beklenen Çıktı :**False**
     */
    public static void main(String[] args) {

        int [] arr = {1551,1223,1443,1267,1789,1023,2020};

        int aranan = 2020;
        Arrays.sort(arr);
        int sonuc = Arrays.binarySearch(arr,aranan);

        System.out.println(sonuc<0 ? "**False**" : "**True**");
    }
}
