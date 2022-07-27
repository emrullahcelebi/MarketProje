package W3resource;

import java.util.Arrays;

public class Q4 {
    /*
    {1, 2, 3, 4, 5, 6, 7, 8, 8} bu arrayde ardisik 3 elementi gruplayarak asagidaki sekli yazdirin
[[1, 2, 3], 4, 5, 6, 7, 8, 8] -> medyan 2
[1, [2, 3, 4], 5, 6, 7, 8, 8] -> medyan 3
[1, 2, [3, 4, 5], 6, 7, 8, 8] -> medyan 4
[1, 2, 3, [4, 5, 6], 7, 8, 8] -> medyan 5
[1, 2, 3, 4, [5, 6, 7], 8, 8] -> medyan 6
[1, 2, 3, 4, 5, [6, 7, 8], 8] -> medyan 7
[1, 2, 3, 4, 5, 6, [7, 8, 8]] -> medyan 8
     */
    public static void main(String[] args) {

        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 8};

        medyan(arr, 2);
        medyan(arr, 3);
        medyan(arr, 4);
        medyan(arr, 5);
        medyan(arr, 6);
        medyan(arr, 7);
        medyan(arr, 8);

    }



    private static void medyan(int[] arr, int med) {
        int medyanIndex = Arrays.binarySearch(arr,med);

        int uclu [] = new int[3];
        uclu[0] = arr[medyanIndex-1];
        uclu[1] = arr[medyanIndex];
        uclu[2] = arr[medyanIndex+1];

        System.out.print("[");
        for (int i = 0; i < arr.length-1 ; i++) {
            if (i==medyanIndex-1) {
                System.out.print(med==arr[arr.length-2] ? Arrays.toString(uclu) : Arrays.toString(uclu) + ", ");
            } else if (i==medyanIndex || i==medyanIndex+1){
            } else System.out.print(arr[i] + ", ");
        }

        if (med==arr[arr.length-2]){
            System.out.print("]");
        } else System.out.print(arr[arr.length-1] + "]");

        System.out.println(" -> medyan " + med);

    }
}
