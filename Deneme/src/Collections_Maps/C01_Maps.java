package Collections_Maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]
        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size()); // 4 -- 4 tane element var cunku

        // tum ogrencilerin bilgilerini alt alta yazdiralim
        Collection<String> tumValueColl = sinifList.values();

        for (String each: tumValueColl
             ) {
            System.out.println(each);
        }
        /*
        Ali, Can, JDev
        Enes, Cem, Tester
        Taha, Emre, JDev
        Derya, Deniz, Tester
         */

        // Map`teki ogrencilerin isim ve soyisimlerinden bir list olusturun
        String [] eachArr;
        List<String> sinifIsimSoyisimList = new ArrayList();
        for (String each: tumValueColl
             ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);
    }
}
