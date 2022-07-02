package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenen = 3;

        // BinarySearch kullanmak icin once sort yapmak sart. Bize indexi dondurur

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr, istenen)); //2

        //Eger olmayan bir elemani aratirsak cevap -(olsaydi kacinci sirada olurdu) olur
    }
}
