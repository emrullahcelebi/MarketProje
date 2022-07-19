package FreeWork;

import java.util.Arrays;

public class Q7 {
    /*
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]

     */
    public static void main(String[] args) {

        int arr [] = arrayOfMultiples(7, 5);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayOfMultiples(int i1, int i2) {
        int[] arr = new int[i2];

        int toplam = i1;
        for (int i = 0; i < i2; i++) {
            arr[i] = toplam;
            toplam+=i1;
        }
        return arr;
    }
}
