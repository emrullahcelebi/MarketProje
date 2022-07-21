package Replit6;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
    /*
    Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
    Array List: siyah,mavi,kirmizi,beyaz
    en başa: pembe
    mavi-kirmizi arasına yesil renk eklenecek.
     */
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");

        list.add(0,"pembe");
        list.add(3,"yesil");

        System.out.println(list);
    }
}
