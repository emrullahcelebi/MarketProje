package Replit;

import java.util.Scanner;

public class Tr_Scanner_1 {
    //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        double sayi = scan.nextDouble();
        System.out.println(sayi*sayi*sayi/2);
    }
}
