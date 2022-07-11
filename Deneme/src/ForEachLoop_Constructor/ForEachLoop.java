package ForEachLoop_Constructor;

public class ForEachLoop {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 11};
        // Elementleri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // Bunu bir de for-each loop ile yapalim
        // For-each loop`u calistirmak icin hedef bir collection vermeliyiz

        for (int each : arr
             ) {
            System.out.print(each + " ");
        }


    }
}
