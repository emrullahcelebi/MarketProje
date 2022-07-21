package Replit6;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    /*
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
    Array elemanları: siyah,sari,mavi,turuncu
     */
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("siyah");
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");

        for (String each : list
             ) {
            System.out.println(each);
        }
    }
}
