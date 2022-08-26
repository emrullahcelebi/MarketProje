package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Bir listedeki ilk 3 elemani 5`er artirin
         */

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        System.out.println(list);

        ListIterator lit = list.listIterator();

        for(int i = 0; i<3; i++) {
            lit.set((Integer)lit.next()+5);
        }
        System.out.println(list);
    }
}
