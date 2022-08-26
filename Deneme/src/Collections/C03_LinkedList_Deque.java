package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList_Deque {
    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        // Queue methodlari + first versiyonu + last versiyonu var
        // cunku queue`nin childi ve queue gibi sadece sondan degil hem bas hem sondan islem yapabilir

        ll4.removeLastOccurrence("Selim"); // son kullanilan selimi siler
        System.out.println(ll4.pop()); // remove first gibi
    }
}
