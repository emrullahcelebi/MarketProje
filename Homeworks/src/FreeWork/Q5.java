package FreeWork;

import java.util.*;

public class Q5 {
    /*
        Kullanicidan bir pozitif tamsayi isteyin ve bu sayinin rakamlarindan bir array olusturun.
    Ardindan bu sayinin bir fazlasini array olarak yazdirin
    Ornek 1: 787`yi temsil eden [7, 8, 7]
    Cikti: [7, 8, 8]
    Örnek 2: 9999'u temsil eden [9, 9, 9, 9]
    Çıktı: [1, 0, 0, 0, 0]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pozitif tam sayi giriniz");
        String str = scan.next();

        int sayi = Integer.parseInt(str);
        String arr1 [] = str.split("");
        System.out.println("Arrayiniz: " + Arrays.toString(arr1));

        sayi++;

        List<Integer> arr2 = new ArrayList<Integer>();

        while (sayi>0) {
            arr2.add(0,sayi%10);
            sayi/=10;
        }

        int[] arr3 = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            arr3[i] = arr2.get(i);
        }
        System.out.println("Arrayin bir fazlasiyla olusturulan array: " + Arrays.toString(arr3));
    }
}
