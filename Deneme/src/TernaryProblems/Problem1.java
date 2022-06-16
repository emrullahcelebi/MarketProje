package TernaryProblems;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        // Kullanicidan 2 sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();



        System.out.println(sayi1>=sayi2 ? "Buyuk sayi: " + sayi1 : "Buyuk sayi: " + sayi2);
    }
}
