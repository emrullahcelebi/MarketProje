package ifElseStatements;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi<10) {
            System.out.println("sayi 10dan kucuk");
        } else {
            System.out.println("Sayi 10`dan buyuk");
        }

        System.out.println(sayi<10 ? "Sayi 10`dan kucuk" : "Sayi 10`dan buyuk");
        // Bu ustteki if - else ile ayni sey
    }
}
