package Collections_Maps;

import java.util.Map;
import java.util.Set;

public class C06_EntryUpdate {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();

        // Soyismi can olanlarin bransini DataScience yapalim

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        String entryValue;
        String [] arr;
        for (Map.Entry<Integer, String> entry : entrySeti
             ) {
            entryValue = entry.getValue();
            if (entryValue.contains("Can")){
                arr = entryValue.split(", ");
                entry.setValue(arr[0] + ", " + arr[1] + ", DataScience");
            }
        }
        System.out.println(ogrenciMap);
    }
}
