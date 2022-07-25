package Replit7;

import java.util.Scanner;

public class Conditional_Statement_1 {
    /*
    Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        if (input == 0) {
            System.out.println("Sayi 0");
        } else if (input<0) {
            System.out.println("Sayi negatif");
        } else System.out.println("Sayi pozitif");
    }
}
