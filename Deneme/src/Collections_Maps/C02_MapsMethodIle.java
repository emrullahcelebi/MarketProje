package Collections_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        // ogrenciMap`in tum valuelerini sirali yazdiralim
        ReusableMethods.mapValueYazdir(ogrenciMap);
        /*
        1) Ali, Can, JDev
        2) Enes, Cem, Tester
        3) Taha, Emre, JDev
        4) Derya, Deniz, Tester
         */

        // Isim ve soyisimlerin birlikte olacagi bir liste olusturalim
        List<String> ogrenciList = ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println(ogrenciList);
        // [Ali Can, Enes Cem, Taha Emre, Derya Deniz]

        // Kac farkli brans varsa bransIsmi = branstakiOgrenciSayisi seklinde yazdirin
        ReusableMethods.bransOgrenciSayisiYazdir(ogrenciMap);
    }
}
