package List;

import java.util.ArrayList;
import java.util.List;

public class ListElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        // Verilen bir listede istenen 2 indexteki elementlerin yerini kalici olarak
        // degistiren bir method yaziniz

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex = 2, sonIndex = 5;

        System.out.println(sayilar);

        sayilar = swapElements(sayilar, ilkIndex, sonIndex);

        System.out.println(sayilar);
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int sonIndex) {
        int tem = 0;
        if (ilkIndex>=sayilar.size() || sonIndex>=sayilar.size()){
            System.out.println("Verilen indexler liste uzunluguna uygun degil");
        } else {
            tem = sayilar.get(ilkIndex);
            sayilar.set(ilkIndex, sayilar.get(sonIndex));
            sayilar.set(sonIndex, tem);
        }

        return sayilar;
    }
}
