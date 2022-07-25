package Replit7;

import java.util.Scanner;

public class Conditional_Statement_7 {
    /*
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        for (int i = 1; i <11 ; i++) {
            System.out.println(num1 + " x " + i + " = " + (i*num1));
        }
    }
}
