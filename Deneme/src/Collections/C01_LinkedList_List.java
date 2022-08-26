package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList_List {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]
        System.out.println(ll2.remove(3)); // Ayseyi siler, return olarak ayse verir, sayilarda karisiklik vardi hatirla
        System.out.println(ll2.remove("Kemal")); // False
        ll2.set(1,"Serap"); // Done gitti Serap geldi
        // List ozellikleri iste
        ll1.add("Berk");
        ll1.add("Ismail");
        ll2.retainAll(ll1);// ll2 `yi ll1 ile karsilastirir ve ll1`de olmayanlari siler
        System.out.println(ll2); // [Berk]
        System.out.println(ll2.hashCode()); // referans numarasi - 2066939
    }
}
