package Replit7;

public class Conditional_Statement_9 {
    /*
    yarim elmas uzunlugu 7 olan elmas deseni görüntüsünü çizen java kodunu yazınız.
     */
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 1; j <= 13; j++) {
                if (j>=7-i && j<=7+i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= 13; j++) {
                if (j>=7-i && j<=7+i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
