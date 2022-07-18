package ForEachLoop_Constructor;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        // Bir String olusturun ve Stringteki her bir karakteri for-each loop ile yazdirin

        String str = "Java ogrenmek cok zevkli";

        String chr[] = str.split("");

        for (String each : chr
             ) {
            System.out.print(each + " ");

        }
    }
}
