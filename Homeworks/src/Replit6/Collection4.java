package Replit6;

import java.util.ArrayList;
import java.util.List;

public class Collection4 {
    /*
    Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
    Array Elemanları: sari,yesil,mavi,pembe
    mavi rengini turuncu ile değiştirelim.
     */
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");

        System.out.println(list);

        list.set(2,"turuncu");
        System.out.println(list);
    }
}
