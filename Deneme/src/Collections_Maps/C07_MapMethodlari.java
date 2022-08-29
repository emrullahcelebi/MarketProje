package Collections_Maps;

import java.util.Map;

public class C07_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(ogrenciMap);

        ogrenciMap.clear(); // temizler
        System.out.println("Clear`dan sonra map: " + ogrenciMap); // Clear`dan sonra map: {}

        ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap.getOrDefault(104, "Aradiginiz key yok"));
        // Derya, Deniz, Tester
        System.out.println(ogrenciMap.getOrDefault(110, "Aradiginiz key yok"));
        // Aradiginiz key yok

        ogrenciMap.putIfAbsent(104, "Derya, Okyanus, Tester"); //zaten 104 var oldugu icin degisiklik yok
        ogrenciMap.putIfAbsent(105, "Aysun, Can, Devops"); // Ekledi
        ReusableMethods.entryYazdir(ogrenciMap);
        //101=Ali, Can, JDev
        //102=Enes, Cem, Tester
        //103=Taha, Emre, JDev
        //104=Derya, Deniz, Tester
        //105=Aysun, Can, Devops

        /*
        ogrenciMap`e key olarak 104 yoksa, value "Mevlut, Han, Tester" ekleyin.
        104 daha onceden varsa "Eski degeri degistirmek istediginize emin misiniz?"
        yazdirin
         */

        // normalde contains daha mantikli ama simdi putIfAbsent ile yapalim
        if (ogrenciMap.putIfAbsent(104, "Mevlut, Han, Tester")!=null) {
            System.out.println("Eski degeri degistirmek istediginize emin misiniz?");
        } else {
            System.out.println("Ekleme basarili");
        }

        // putIfAbsent key varsa o keyin value su, yoksa ekleme yapip null doner

        System.out.println(ogrenciMap.remove(105)); // Aysun, Can, Devops -- sildigini dondurur
        System.out.println(ogrenciMap.remove(104, "Derya, Deniz, Tester")); // true dondurur

        ReusableMethods.entryYazdir(ogrenciMap);
        //101=Ali, Can, JDev
        //102=Enes, Cem, Tester
        //103=Taha, Emre, JDev

        System.out.println(ogrenciMap.replace(103, "Erdal, Ciftci, Tester")); // Taha, Emre, JDev - put gibi ama eskiyi
                                                                                // dondurur

    }
}
