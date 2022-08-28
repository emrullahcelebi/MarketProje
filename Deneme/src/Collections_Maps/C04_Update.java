package Collections_Maps;

import java.util.Map;

public class C04_Update {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        
        // Verilen map`te JDev degerlerini JavaDeveloper olarak degistirelim

        for (Integer each: ogrenciMap.keySet()
             ) {
            ogrenciMap.put(each, ogrenciMap.get(each).replace("JDev", "JavaDeveloper"));
        }

        System.out.println(ogrenciMap);
    }
}
