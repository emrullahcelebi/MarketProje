package day6_practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
      public static void main(String[] args) {
          Scanner scan  = new Scanner(System.in);


          String input = "";

          do {
              System.out.println("Lutfen bir karakter giriniz. Bitirmek icin X`e basabilirsiniz");
              input = scan.next();
              if (input.toLowerCase().equals("x")){
                  System.out.println("Program bitti");
              } else System.out.println("Program çalışıyor");
          } while (!input.toLowerCase().equals("x"));
      }
}
