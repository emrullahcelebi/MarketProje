package TernaryProblems;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        /* Kullanicidan bir tam sayi alin ve
        sayi 10dan kucukse "Rakam"
        10-100 arasi ise "Iki basamakli sayi"
        100 uzeriyse "3 basamakli ve ya daha buyuk bir sayi"
        yazdirin */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi<10 ? (sayi>=0 ? "Sayi rakam" : "Sayi negatif") :
                (sayi<100 ? "Sayi 2 basamakli" : "Sayi 3 veya daha cok basamakli"));
    }
}
