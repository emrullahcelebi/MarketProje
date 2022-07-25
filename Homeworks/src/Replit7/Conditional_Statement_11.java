package Replit7;

import java.util.Scanner;

public class Conditional_Statement_11 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise
    hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String harf = in.next();

        if (harf.length()!=1 || harf.replaceAll("\\W", "").replaceAll("\\d","").length()!=1){
            System.out.println("Yanlis karakter girdiniz!");
        } else {
            switch (harf.toLowerCase().charAt(0)) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(harf + " harfi sesli harftir"); break;
                default:
                    System.out.println(harf + " harfi sessiz harftir");
            }
        }
    }
}
