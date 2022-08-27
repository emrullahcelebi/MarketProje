package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_Sets {
    /*
    matematikteki kume mantigi, her elemet unique
     */
    public static void main(String[] args) {
        // Verilen arraydeki tekrar eden elementleri silip tekrarsiz halini array`e atayan kod yazin

        int[] arr = {4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsiz = new HashSet<>();

        for (int each: arr
             ) {
            tekrarsiz.add(each);
        }
        System.out.println(tekrarsiz); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr = new int[tekrarsiz.size()];
        System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i = 0;
        for (int each : tekrarsiz
             ) {
            arr[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
