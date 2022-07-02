package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenen = 3;

        // BinarySearch kullanmak icin once sort yapmak sart. Bize indexi dondurur

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, istenen));
    }
}
