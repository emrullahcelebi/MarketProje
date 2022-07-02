package Arrays;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        String kelimeler[] = str.split(" ");
        // Spacelerden boler, space yerine virgul olur.

        System.out.println(Arrays.toString(kelimeler)); // ["Java", "gun", "gectikce", "guzellesiyor"]

        String gectikce[] = str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); // ["Java gun ", " guzellesiyor"]

        String harfler [] = str.split("");
        System.out.println(Arrays.toString(harfler)); // karakter karakter ayirir
    }
}
