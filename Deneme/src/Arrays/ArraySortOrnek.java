package Arrays;

import java.util.Arrays;

public class ArraySortOrnek {
    // verilen bir array`de en kucuk ve en buyuk degerleri yazdirin

    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,0,45,25,4,9,0};

        // Sort kullanmadan:

        int kucuk= arr[0];
        int buyuk= arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<kucuk) kucuk=arr[i];
            if (arr[i]>buyuk) buyuk=arr[i];
        }

        System.out.println("En kucuk = " + kucuk + "\nEn buyuk = " + buyuk);

        // Sort ile:

        Arrays.sort(arr);

        System.out.println("En kucuk = " + arr[0] + "\nEn buyuk = " + arr[arr.length-1]);
    }
}
