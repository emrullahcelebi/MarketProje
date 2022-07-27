package W3resource;

import java.util.Scanner;

public class Q11 {
    /*
     Write a Java program to accept a positive number and repeatedly add all its digits
     until the result has only one digit.
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int number = scan.nextInt();

        int result = number;

        do {
            result = sumNumber(result);
        }while (result >= 10);

        System.out.println("result = " + result);
    }

    private static int sumNumber(int number) {
        int sum =0;

        while (number>0){
            sum += number%10;
            number /= 10;
        }

        return sum;
    }
}
