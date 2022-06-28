package NestedForLoop;

import java.util.Scanner;

public class NestedForloop {

    // Kullanicidan bir rakam alin ve carpim tablosu yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir pozitif rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }

        }

    }

