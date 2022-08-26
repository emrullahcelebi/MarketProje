package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        /*
        ListIterator Iterator interface`inin child Interface`idir ama daha cok method`a sahiptir
         */

        List<Integer> liste = new ArrayList<Integer>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        ListIterator lit1 = liste.listIterator();

        Integer temp;

        while (lit1.hasNext()) {
            temp = (Integer) lit1.next() +3;
            lit1.set(temp);
        }
        System.out.println(liste);
    }
}
