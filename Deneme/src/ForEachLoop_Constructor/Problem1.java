package ForEachLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        /*
        Iki String array olusturun ve bu araylerdeki ortak elemanlari for-each loop
        kullanarak bulun ve yazdirin
        Ortak eleman yoksa "Ortak eleman yok" yazdirin.
         */

        String array1[] = {"Ali", "Ayse", "Can", "Fatma"};
        String array2[] = {"Can", "Evren", "Emsal", "Fatma", "Emre"};

        List<String> ortalElemanlar = new ArrayList<String>();

        for (String each1: array1
             ) {
            for (String each2: array2
                 ) {
                if (each1.equals(each2)) {
                    ortalElemanlar.add(each1);
                }
            }
        }
        if (ortalElemanlar.isEmpty()) {
            System.out.println("Ortak eleman yok");
        } else {
            System.out.println("Iki arraydeki ortak elemanlar: " +ortalElemanlar);
        }
    }
}
