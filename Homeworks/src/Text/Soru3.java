package Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru3 {
    /*
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        String str [] = cumle.trim().split(" ");
        String reverse = "";

        for (int i = str.length-1; i >= 0; i--) {
            reverse+=str[i] + " ";
        }
        reverse.trim();
        System.out.println(reverse);
    }
}
