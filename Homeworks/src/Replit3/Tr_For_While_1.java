package Replit3;

import java.util.Scanner;

public class Tr_For_While_1 {
    /*
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
    ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;
    String name =“John came late"

    Expected Output:
    Number of a = 2
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String name = scan.nextLine();
        char ch1 = scan.next().charAt(0);
        int number = 0;

        for (int i = 0; i <name.length() ; i++) {
            if (name.toLowerCase().charAt(i)==ch1) number++;
        }
        System.out.println("Number of " +ch1 + " = "+ number);

    }
}
