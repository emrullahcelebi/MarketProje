package Replit6;

import java.util.ArrayList;
import java.util.List;

public class Collection5 {
    /*
    Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");

        System.out.println("Orjinal array list: " + list);

        for (String s : list
             ) {
            System.out.println(s);
        }
    }
}
