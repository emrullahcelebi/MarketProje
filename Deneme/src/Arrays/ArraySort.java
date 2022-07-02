package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        String[] arr = {"S","M","A","T"};

        System.out.println(Arrays.toString(arr)); // [S, M, A, T]

        Arrays.sort(arr); // siralama yapar

        System.out.println(Arrays.toString(arr)); // [A, M, S, T]
        // Javada bu siralamaya natural order denir.
        // sayi olursa kucukten buyuge, stringse alfabetik



    }
}
