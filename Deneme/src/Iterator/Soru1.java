package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz

        input: [2,13,56,23,45,14,40] , istenen sayi araligi : 20-40 (sinirlar dahil)
        output: [23,40]
         */

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        int basSinir = 20;
        int sonSinir = 40;
        Integer sayi = 0;

        ListIterator lit = list.listIterator();

        while (lit.hasNext()) {
            sayi = (Integer)lit.next();
            if (sayi<basSinir || sayi>sonSinir){
                lit.remove();
            }
        }
        System.out.println(list);
    }
}
