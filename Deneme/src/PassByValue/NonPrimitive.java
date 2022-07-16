package PassByValue;

import java.util.Arrays;

public class NonPrimitive {
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        elemanDegistir(arr);
        System.out.println("Method call sonrasi : " + Arrays.toString(arr)); // [5, 6, 3]
        arrDegistir(arr);
        System.out.println("2. Method call sonrasi : " + Arrays.toString(arr)); // [5, 6, 3]
    }



    private static void elemanDegistir(int[] arr) {
        arr[0] =5;
        arr[1] =6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]
    }

    /*
    Nonprimitive  data turlerinde objenin kendisi degil de icindeki elementler degisirse
    JAVA objenin kendisi ve referansi degismedigi icin element degisikliklerini kabul eder ve kalici yapar
     */
    private static void arrDegistir(int[] arr) {
        arr = new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
    }
}
