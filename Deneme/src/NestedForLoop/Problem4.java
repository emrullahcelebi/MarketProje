package NestedForLoop;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String kelime = scan.nextLine();

        for (int i = 1; i <= kelime.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(kelime.substring(j-1, j) + " ");
            }
            System.out.println("");
        }

        for (int i = kelime.length()-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(kelime.substring(j-1, j) + " ");
            }
            System.out.println("");
        }
    }
}
