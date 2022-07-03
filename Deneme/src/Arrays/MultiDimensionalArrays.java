package Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][][] arr = {{{1,2},{3,4},{5,6}},{{7,8},{9,1},{2,3}}};
        // int [0][0][0] = 1 ==> en distan ice dogru siralanir

        int [][] arr2 = {{3,1,7},{6,10,2}};
        // 7`yi yazdiralim
        System.out.println(arr2[0][2]);
        // ilkmic arrayi yazdiralim
        System.out.println(Arrays.toString(arr2[0])); // [3, 1, 7]

        System.out.println(Arrays.toString(arr2)); // referans kodlarini yazar [[I@58372a00, [I@4dd8dc3]
        System.out.println(Arrays.deepToString(arr2)); // tum arrayi yazar [[3, 1, 7], [6, 10, 2]]

    }
}
