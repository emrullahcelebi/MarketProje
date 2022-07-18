package day7_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
    */
       public static void main(String[] args) {
           Scanner scan  = new Scanner(System.in);

           List<String> list = new ArrayList<String>();

           do {
               System.out.println("Array icin eleman girin. Islemi bitirmek icin . yazin");
               list.add(scan.next());
           }while (!list.contains("."));

           int [] arr = new int[list.size()-1];

           for (int i = 0; i < list.size()-1; i++) {
               arr[i] = Integer.parseInt(list.get(i));
           }
           System.out.println("Array`iniz: " + Arrays.toString(arr));

           int buyuk = arr[0];
           int kucuk = arr[0];

           for (int each: arr
                ) {
               if (each>buyuk) buyuk=each;
               if (each<kucuk) kucuk=each;
           }

           System.out.println("Fark = " + (buyuk-kucuk));
       }

}
