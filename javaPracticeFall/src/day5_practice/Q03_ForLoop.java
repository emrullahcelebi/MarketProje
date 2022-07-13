package day5_practice;

import java.util.Scanner;

public class Q03_ForLoop {

      /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
      public static void main(String[] args) {
          Scanner scan  = new Scanner(System.in);

          System.out.println("Lutfen uzunluk girin");
          int uzunluk = scan.nextInt();
          System.out.println("Lutfen yukseklik girin");
          int yukseklik = scan.nextInt();

          for (int i = 1; i <=yukseklik ; i++) {
              for (int j = 1; j <=uzunluk ; j++) {
                  System.out.print("* ");
              }
              System.out.println("");
          }
      }
}
