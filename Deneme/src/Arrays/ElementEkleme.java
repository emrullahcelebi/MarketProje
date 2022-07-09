package Arrays;

import java.util.Arrays;

public class ElementEkleme {
    public static void main(String[] args) {

        // Verilen array`e yeni bir element ekleme

        int[] arr = {3, 5, 7};
        // arr[3] = 8; array`de olmayan bir index`e atama yapamayiz
        // arr = {1,3,5,6}; bu da olmaz
        // arr = {1,2,3} bu bile olmaz

        arr = new int[4];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        int arrYeni[] = new int[5];

        arr = arrYeni;
        System.out.println(Arrays.toString(arrYeni)); // [0, 0, 0, 0, 0]

        arrYeni[0] = 2;
        arrYeni[3] = 5;
        System.out.println(Arrays.toString(arr)); // [2, 0, 0, 5, 0]
        // arraye yeni deger atarken eleman sayisinda ekleme cikarma yapilamaz ancak baska array atanarak yapilabilir
    }
}
