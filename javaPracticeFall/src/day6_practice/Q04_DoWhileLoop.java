package day6_practice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
     public static void main(String[] args) {
         Scanner scan  = new Scanner(System.in);

         System.out.println("Bir kelime girin");
         String kelime = scan.next();

         if (kelime.length()<3 || kelime.length()%2==0) {
             System.out.println("Yanlis kelime girdiniz!");
         } else {
             System.out.println("Ortadaki harf: " + kelime.charAt(kelime.length()/2));
         }
     }
}
