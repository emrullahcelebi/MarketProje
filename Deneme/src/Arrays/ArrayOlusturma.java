package Arrays;

import java.util.Arrays;

public class ArrayOlusturma {
    public static void main(String[] args) {
        //int arr1 = {1,2,3}; // Koseli parantez olmadan array olmaz
        int arr2[] = {1,2,3};
        int[] arr3 = {2,3,4};
        double [] arr4 = {1,3,4}; // Koseli parantezin yeri farkli farkli olabilir bu sekillerde
        String[] arr5 = {"ali","veli","ayse"};

        int arr6[]; // sadece deklare edilip birakilabilir ancak kullanmak icin atama yapmak sart
        int arr7[] = new int[5]; // 5 elemanlik array olusturur, degerleri default(0) atar {0,0,0,0,0}

        arr7[0] = 8; //{8,0,0,0,0}
        System.out.println(arr7[3]); // 0
        System.out.println(arr7); // [I@58372a00 == referans numarasi. cunku non-primitive

        for (int i = 0; i <3 ; i++) {
            System.out.print(arr2[i]+" "); // 1 2 3
        }
        System.out.println("");

        System.out.println(Arrays.toString(arr2)); // [1, 2, 3]
                                                    // Bu sekilde listeyi yazdirabiliriz

        arr2[0] = 13;
        arr2[2] = 27;

        System.out.println(Arrays.toString(arr2)); // [13, 2, 27]

        for (int i = 0; i < arr2.length; i++) { // .length eleman sayisini verir. Stringde parantezliyken bunda degil
            arr2[i] += i;
        }
        System.out.println(Arrays.toString(arr2)); // [13, 3, 29]
    }
}
