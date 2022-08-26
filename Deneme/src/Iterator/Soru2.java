package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Bir listedeki elementleri iterator kullanarak sondan basa yazdirin
         */
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        System.out.println(list);

        ListIterator lit = list.listIterator();

        while (lit.hasNext()) {
            lit.next();
        }
        // iterator sonda

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
    }
}
