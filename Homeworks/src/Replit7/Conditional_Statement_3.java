package Replit7;

import java.util.Scanner;

public class Conditional_Statement_3 {
    /*
    Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int buyuk = Math.max(num1, Math.max(num2, num3));

        System.out.println("En buyuk sayi: " + buyuk);
    }
}
