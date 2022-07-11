package List;

import java.util.ArrayList;
import java.util.List;

public class ListedenTekrarliElementSilme {
    public static void main(String[] args) {
         // Verilen bir listede tekrar eden sayilari sadece bir kez yazdiran bir method olusturun

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        List<Integer> tekrarsiz = new ArrayList<Integer>();
        tekrarsiz = tekrarsizListeOlustur(sayilar);

        System.out.println(tekrarsiz);
    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList = new ArrayList<Integer>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }
        }

        return tekrarsizList;
    }
}
