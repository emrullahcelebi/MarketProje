package IfProblems;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        //Kullanicidan yasini isteyin. 65 veya daha buyukse emekli olabilir,
        // degilse emekli olamaz yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas= scan.nextDouble();

        if (yas >=65){
            System.out.println("Emekli olabilir");
        } else {
            System.out.println("Emekli olamaz");
            System.out.println(65-yas + " sene sonra emekli olabilirsin");
    }
    }
}
