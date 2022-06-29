package Replit;

import java.util.Scanner;

public class Tr_Scanner_7 {
    //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        double sayi1 = scan.nextDouble();
        int sayi2 = (int) sayi1;

        System.out.println(sayi2);
    }
}
