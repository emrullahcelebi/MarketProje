package Arrays;

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

    }
}
