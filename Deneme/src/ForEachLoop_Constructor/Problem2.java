package ForEachLoop_Constructor;

import Arrays.MethodsArray;

public class Problem2 {
    public static void main(String[] args) {
        // Bir int array olusturun ve tum elemanlarin karelerinin toplamini yazdirin

        int arr[] = MethodsArray.arrayOlustur();

        int toplam = 0;

        for (int each: arr
             ) {
        toplam+= each*each;
        }
        System.out.println("Kareler toplami = " + toplam);
    }
}
