package day6_practice;

import java.util.Arrays;

public class Q06_Arrays {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */
    public static void main(String[] args) {

        String str = "HeySiri";
        String[] arr = new String[str.length()];

        arr = str.split("");

        String bye = "ByeSiri";

        for (int i = 1; i <=arr.length; i++) {
            arr[i-1] = str.substring(i-1,i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
