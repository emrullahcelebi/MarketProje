package Collections_Maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer, String> mapOlustur(){
        Map<Integer, String> sinifMap = new HashMap<>();
        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Tester");

        return sinifMap;
    }

    public static void mapValueYazdir(Map<Integer, String> ogrenciMap){
        Collection<String> tumValueColl = ogrenciMap.values();
        int sira =1;

        for (String each: tumValueColl
        ) {
            System.out.println(sira + ") " + each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        String [] eachArr;
        List<String> sinifIsimSoyisimList = new ArrayList();
        for (String each: ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        return sinifIsimSoyisimList;
    }
}
