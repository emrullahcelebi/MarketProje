package MDArraysProblems;

import java.util.Scanner;

public class Problem3 {
    // Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().trim();

        String kelimeler[] = cumle.split(" ");

        System.out.println("Kelime sayisi = " + kelimeler.length);
    }
}
