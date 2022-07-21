package Replit6;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection7 {
    /*
    bir LinkedList oluşturalım ve Iterator methodunu kullanarak
    listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
    1. elemandan itibaren yazdıralım.
     */
    public static void main(String[] args) {

        LinkedList <String> list = new LinkedList<>();
        list.add("sari");
        list.add("beyaz");
        list.add("mavi");
        list.add("yesil");
        list.add("turuncu");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
