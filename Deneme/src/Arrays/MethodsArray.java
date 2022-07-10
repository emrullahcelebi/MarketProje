package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsArray {
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

    public static int[] arrayOlustur(){
        Scanner scan  = new Scanner(System.in);
        int arr [] = new int[1];
        int sayi= 0;
        String sayiStr = "";

        do {
            System.out.println("Olusturulacak Array icin eleman giriniz. Bitirmek icin . yazin");
            sayiStr = scan.next().trim();
            if (!sayiStr.equals(".")) {
                sayi = (int) Double.parseDouble(sayiStr);
                arr = MethodsArray.arrayeElemanEkle(arr, sayi);
            }
        } while (!sayiStr.equals("."));

        int son[] = new int[arr.length-1];
        for (int i = 1; i <=arr.length-1 ; i++) {
            son[i-1] = arr[i];
        }
        return son;
    }
}
