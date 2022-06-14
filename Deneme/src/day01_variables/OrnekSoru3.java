package day01_variables;

import java.util.Scanner;

public class OrnekSoru3 {
    public static void main(String[] args) {
        // Kullanicidan yaricap isteyip dairenin cevresi ve alanini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz:");
        double yaricap= scan.nextDouble();

        System.out.println("Dairenin cevresi: " + (6.28*yaricap));
        System.out.println("Dairenin alani: " + (3.14*yaricap*yaricap));
    }
}
