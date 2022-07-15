package Replit5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array10 {
    /*
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    Test Data:
    sentence -> "Java is fun"
    reversed **-> "**fun is Java**"**
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed+= sentence.charAt(i);
        }
        System.out.println(reversed); // testte istenen

        String str[]= sentence.split(" ");
        reversed = "";

        for (int i = str.length-1; i >=0 ; i--) {
            reversed+= str[i] + " ";
        }

        reversed = reversed.trim();
        System.out.println(reversed);

        }
}
