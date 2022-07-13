package day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
     public static void main(String[] args) {
         Scanner scan  = new Scanner(System.in);

         System.out.println("Lutfen bir harf giriniz");
         String harf = scan.nextLine();
         char ilk = harf.toLowerCase().charAt(0);

         boolean harfMi = false;
         boolean sesli = false;

         if (harf.length()==1) {
             for (char i = 'a'; i <= 'z'; i++) {
                 if (ilk == i) {
                     harfMi = true;
                     if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') sesli = true;
                 }
             }
         }
         if (harfMi){
             System.out.println(sesli? harf + " Harfi sesli harftir" : harf + " Harfi sessiz harftir");
         } else System.out.println("Yanlis karakter girdiniz!");
     }

}
