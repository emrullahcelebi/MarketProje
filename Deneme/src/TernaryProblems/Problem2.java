package TernaryProblems;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin ve tek mi cift mi oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi tek");
    }
}
