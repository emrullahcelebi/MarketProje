package Replit7;

import java.util.Scanner;

public class Conditional_Statement_2 {
    /*
    iki sayıyı kıyaslayan Java kodunu yazınınz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1<number2) {
            System.out.println(number1 + " != " + number2 + "\n" + number1 + " < " + number2);
        } else if (number1>number2) {
            System.out.println(number1 + " != " + number2 + "\n" + number1 + " > " + number2);
        } else {
            System.out.println(number1 + " = " + number2);
        }
    }
}
