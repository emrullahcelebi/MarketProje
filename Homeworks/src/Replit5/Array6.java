package Replit5;

import java.util.Arrays;

public class Array6 {
    /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
    Array: [12,15,43,23,56,76,78,90,77,43]
     */
    public static void main(String[] args) {

        byte arr [] = {12,15,43,23,56,76,78,90,77,43};
        byte aranan = 56;

        System.out.println("Aranan eleman " + Arrays.binarySearch(arr, aranan)
        +". indexte ve " + (Arrays.binarySearch(arr, aranan)+1) + ". sirada");
    }
}
