package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        // Listedeki tum elementleri index kullanmadan 3 artiralim

        for (Integer each: liste
             ) {
            each+=3;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(liste); // [10, 20, 30] -> degismedi

        /*
        JAVA index yapisi olmayan collectionlardaki elementlere ulasmak veya degistirmek icin iterator
        interface`ini olusturmustur

        iterator interface oldugundan ondan obje uretemeyiz. Onun yerine bize iterator donduren
        liste.iterator methodunu kullaniyoruz
         */
        Iterator it1 = liste.iterator();

        // iterator kullanarak eleman silelim
        it1.next(); // 10`u uzerine aldi
        it1.remove(); //10 gitti
        it1.next(); // 20`yi aldi
        it1.remove(); // 20 gitti
        it1.next(); // 30`u aldi
        it1.remove(); // 30 gitti
        System.out.println(liste); //[]

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Looptan once: " + liste); // Looptan once: [10, 20, 30]

        Iterator it2 = liste.iterator();

        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
        System.out.println("Looptan sonra: " + liste); // Looptan sonra: []



    }
}
