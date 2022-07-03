package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        char ortaHarf = kelime.charAt((kelime.length()-1)/2);

        if (kelime.length()<3){
            System.out.println("Kelime cok kisa");
        } else if (kelime.length()%2==1){
            System.out.println("Ortadaki harf: " + ortaHarf );
        } else System.out.println("Kelimede harf sayisi cift, orta harf yok");
    }
}
