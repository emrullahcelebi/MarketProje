package List;

import java.util.ArrayList;
import java.util.List;

public class ListSoruOrtalama {
    public static void main(String[] args) {
        // Bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(3.0);
        list.add(5.0);
        list.add(3.0);
        list.add(5.0);
        list.add(6.0);
        list.add(1.0);
        list.add(7.0);

        List<Double> ortalamaUstuler = new ArrayList<Double>();
        double ortalama = 0;
        for (int i = 0; i < list.size(); i++) {
            ortalama+=list.get(i);
        }
        ortalama/= list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>ortalama) {
                ortalamaUstuler.add(list.get(i));
            }
        }
        System.out.println("Ortalama = " + ortalama + " Ortalama ustu olanlar = " +ortalamaUstuler);

    }
}
