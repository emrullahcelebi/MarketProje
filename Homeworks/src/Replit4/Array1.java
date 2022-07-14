package Replit4;

import java.util.Arrays;

public class Array1 {
    /*
    Karışık verilen sayıları ve kelimeleri sıralayan Java kodu yazınız.
    not: Test datadaki değerleri kullanınız.
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
     */
    public static void main(String[] args) {

        int sayi[] = {1232, 1134, 2345, 1022};
        String str[] = {"Java", "Python", "Php", "C#", "C Programming", "C++"};

        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
