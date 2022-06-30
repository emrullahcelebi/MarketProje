package Replit3;

import java.util.Scanner;

public class Tr_For_While_4 {
    /*
    Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
    Input : 6
    Output: 6!=65432*1=720
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();
        int faktoriyel = 1;
        String fakt = "";

        for (int i = sayi; i >1 ; i--) {
            faktoriyel*=i;
            fakt = fakt + i + "*";

        }
        System.out.println(sayi+ "!="+fakt + "1="+faktoriyel);

    }
}
