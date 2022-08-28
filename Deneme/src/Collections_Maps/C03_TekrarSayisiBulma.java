package Collections_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C03_TekrarSayisiBulma {

    public static void main(String[] args) {

        /*
        Verilen bir String`teki kullanilan harfleri ve
        kullanilan harflerin tekrar sayisini H=20 seklinde yadirin
         */

        String str = "Heeeeellllooooo Woooorrrrllllllddddd";

        String harflerArr [] = str.replaceAll("\\W","").split("");

        Map<String, Integer> harfKullanimSayilariMap = new TreeMap<>();

        for (String each: harflerArr
             ) {
            if (!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each, 1);
            } else {
                harfKullanimSayilariMap.put(each, harfKullanimSayilariMap.get(each) + 1);
            }
        }
        System.out.println(harfKullanimSayilariMap);
    }
}
