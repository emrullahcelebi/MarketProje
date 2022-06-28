package ForLoop;

import java.util.Scanner;

public class Problem10V2 {
    // Kullanicidan bir String isteyin ve palindrom olup olmadigini kontrol eden bir method yazin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String input = scan.nextLine();

        polindromeControl(input);
    }

    private static void polindromeControl(String input) {
        String terstenInput = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput += input.charAt(i);
        }

        System.out.println(input.equalsIgnoreCase(terstenInput)? "Polindrome" : "Polindrome degil");
    }
}
