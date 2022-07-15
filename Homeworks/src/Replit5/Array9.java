package Replit5;

public class Array9 {
    /*
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
    Array: [1,2,3,4,5,6,7,8,9]
     */
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int sayacC = 0;
        int sayacT = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sayacC++;
            }else sayacT++;
        }
        System.out.println(sayacC + " tane cift " + sayacT + " tane tek sayi var");
    }
}
