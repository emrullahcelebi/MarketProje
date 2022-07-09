package NestedForLoop;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kelime = scan.nextLine();

        for (int i = 0; i <= kelime.length() - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(kelime.charAt(j) + " ");
            }
            System.out.println("");
        }

        for (int i = kelime.length() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(kelime.charAt(j) + " ");
            }
            System.out.println("");
        }
    }
}
