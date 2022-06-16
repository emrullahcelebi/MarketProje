package TernaryProblems;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi>=0 ? "Mutlak degeri: " + sayi : "Mutlak degeri: " + (-1)*sayi );
    }
}
