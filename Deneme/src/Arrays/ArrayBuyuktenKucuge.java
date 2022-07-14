package Arrays;

import java.util.Arrays;

public class ArrayBuyuktenKucuge {
    public static void main(String[] args) {

        // Verilen bir array`i tersten yazdiran bir method olusturalim

        int arr[] = {3,5,6,1,9,45,25,4,9,0};

        int arrTers [] = terstenYazdir(arr);
        System.out.println(Arrays.toString(arrTers));
    }

    public static int[] terstenYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[] = new int[arr.length];

        int index = 0;
        int min = arr[0];
        for (int i = arr.length; i >=1; i--) {
            tersArr[i-1] = arr[arr.length-i];


        }

        return tersArr;
    }
}
