package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMethodlar {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Aykut");
        list.add("Yusuf");
        list.add("Ilker");
        list.add("Oguzhan");
        list.add("Mami");
        System.out.println(list); // [Aykut, Yusuf, Ilker, Oguzhan, Mami]

        list.set(1,"Engin"); // Yusuf gitti Engin geldi, return olarak silineni getirdi
        System.out.println(list); // [Aykut, Engin, Ilker, Oguzhan, Mami]

        System.out.println(list.get(2)); // o indexte ne oldugunu getirir  Ilker

        System.out.println(list.contains("Mehmet")); // icerir mi? Boolean doner. False

        Collections.sort(list); // kucukten buyuge veya alfabetik siraya gore siralar
        System.out.println(list); // [Aykut, Engin, Ilker, Mami, Oguzhan]

        List<String> list2 = new ArrayList<>();
        list2.add("Aykut");
        list2.add("Engin");
        list2.add("Ilker");
        list2.add("Oguzhan");
        list2.add("Mami");

        System.out.println(list.equals(list2)); // indexlerin de ayni olmasi lazim - False

        list2.clear(); // hepsini temizler. Return type yok, void
        System.out.println(list2.isEmpty()); // true

        String arr[] = {"tavsan", "serce"};
        List<String> list3 = Arrays.asList(arr); // Listeye cevirir ancak listenin uzunlugu bir daha degistirilemez
        // Bu yuzden add, remove, clear kullanilamaz. Ayrica Arraydeki bir elemani degistirirsek listede de degisir
        // Ayni sekilde listede degistirirsek Arrayde de degisir
        // String arr[] = list.toArray(new String[0]); yapilarak listten arraye de donusturulebilir
    }
}
