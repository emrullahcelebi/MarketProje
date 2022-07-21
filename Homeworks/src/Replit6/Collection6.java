package Replit6;

import java.util.LinkedList;

public class Collection6 {
    /*
    Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
    LinkedList elemanları: sari,mavi,mor,yesil,beyaz
     */
    public static void main(String[] args) {

        LinkedList <String> linkedList = new LinkedList<String>();

        linkedList.add("sari");
        linkedList.add("mavi");
        linkedList.add("mor");
        linkedList.add("yesil");
        linkedList.add("beyaz");

        for (String each: linkedList
             ) {
            System.out.println(each);
        }
    }
}
