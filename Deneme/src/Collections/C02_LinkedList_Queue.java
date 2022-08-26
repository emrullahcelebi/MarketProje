package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C02_LinkedList_Queue {
    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        // Queue kuyruk demektir, dolayisiyla sira onemlidir, gelen sona gelir giden bastan gider

        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove()); // Adem - secenek veremiyoruz, ilk sira gidiyor. bossa exc
        System.out.println(ll3.remove("Hpolat")); // true
        System.out.println(ll3.element()); // Zeynep - Ilk elementi getirir ama bir sey yapmaz, bossa exc verir
        System.out.println(ll3.peek()); // Zeynep - Ilk elementi getir ama bir sey yapmaz, bossa null verir
        ll3.offer("Ahmet"); // add ile ayni
        System.out.println(ll3.poll()); // Zeynep ilk elementi silip getirir, remove ile ayni ama exc yok null
        System.out.println(ll3);
    }
}
