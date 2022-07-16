package day6_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
     public static void main(String[] args) {
          Scanner scan  = new Scanner(System.in);

          int arr [] = new int[8];

          int sayac = 1;

          do {
               System.out.println("Lutfen olusturulacak arrayin " + sayac + ". elementini girin");
               arr[sayac-1] = scan.nextInt();
               sayac++;
          }while (sayac<=8);

          System.out.println("Olusturulan Array: " + Arrays.toString(arr));

          System.out.print("3`e bolunebilen elemanlar: ");

          for (int i = 0; i < arr.length; i++) {
               if (arr[i]%3==0) System.out.print(arr[i] + " ");
          }
     }

}
