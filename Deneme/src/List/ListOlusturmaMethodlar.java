package List;

import java.util.ArrayList;
import java.util.List;

public class ListOlusturmaMethodlar {
    public static void main(String[] args) {

        List<Integer> sayilarList = new ArrayList<>(); // primitiv kabul etmez wrapper olmali
        System.out.println(sayilarList); // []

        sayilarList.add(5); // [5]
        sayilarList.add(3); // [5, 3]
        sayilarList.add(0,7);//[7, 5, 3]

        System.out.println(sayilarList.size()); //3
        System.out.println(sayilarList.isEmpty()); // false

        List<String> list = new ArrayList<>();
        list.add("Aykut");
        list.add("Yusuf");
        list.add("Ilker");
        list.add("Oguzhan");
        list.add("Mami");

        boolean sonuc = list.remove("Oguzhan"); // boolean doner, ama variable a atamadan da calisir
        if (sonuc==true) {
            System.out.println("Istediginiz isim silindi");
        }else {
            System.out.println("Istediginiz isim listede yok");
        }
        System.out.println(list);

        System.out.println(list.remove(1)); // String olarak neyi sildigini doner

        Integer sayi = 3;
        sayilarList.remove(sayi); // Wrapper yazarsak sayiyi siler primitivde indexi siler

        list.set(1,"Engin"); // Yusuf gitti Engin geldi, return olarak silineni getirdi
        System.out.println(list.get(2)); // o indexte ne oldugunu getirir

    }

}
