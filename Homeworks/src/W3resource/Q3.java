package W3resource;

import java.util.Arrays;

public class Q3 {
    /*
    Her sifiri belirli bir int arrayin sag tarafina tasimak icin bir Java programi yazin.
    Orijinal Array: [0, 3, 4, 0, 1, 2, 5, 0]
    cikti: [3, 4, 1, 2, 5, 0, 0, 0]
     */
    public static void main(String[] args) {

        int arr [] = {0, 3, 4, 0, 1, 2, 5, 0};

        int arr2[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr2[index] = arr[i];
                index++;
            } else {
                arr2[(arr2.length-1)-(i-index)] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
