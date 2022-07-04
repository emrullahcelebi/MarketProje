package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // Kullaniciya kac elementlik bir array olusturacagini sorun
        // arrayi olusturup elementleri kullanicidan alip array e atayin

        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen kac elementli bir array istediginizi yazin");
        int uzunluk = scan.nextInt();

        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin " + (i+1) + ". elemani giriniz");
            arr[i] = scan.nextInt();
        }

        System.out.println("Array = " + java.util.Arrays.toString(arr));
    }
}
