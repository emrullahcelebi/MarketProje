package Arrays;

import java.util.Arrays;

public class ElementEklemeMethod {
    // Verilen Array`e yeni bir elenet ekleyen bir method olusturun

    public static void main(String[] args) {

        int arr[] = {3,5,7};
        int eklenecekEleman = 4;

        arr = arrayeElemanEkle(arr, eklenecekEleman);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekEleman) {

        int yeniArr[] = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[yeniArr.length-1] = eklenecekEleman;


        return yeniArr;
    }
}
