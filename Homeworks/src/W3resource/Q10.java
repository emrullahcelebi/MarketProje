package W3resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10 {
    /*
    Verilen uc kenar uzunlugunun (tam sayıların) ucgen olusturup olusturamayacagini kontrol eden bir Java programi yazin.
    NOT: ucgen olusabilmesi icin herhangi 2 kenarin toplami 3. kenardan buyuk olmali,
    ayrica yine herhangi 2 kenarin farki da 3. kenardan kucuk olmalidir
    Beklenen cikti:
    Giris kenar1: 5
    Giris kenar2: 6
    Giris kenar3: 8
    Kenarlar bir ucgen olusturuyor mu: true
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        List<Integer> kenarlar = new ArrayList<Integer>();

        System.out.println("1. Kenari girin");
        kenarlar.add(scan.nextInt());

        System.out.println("2. Kenari girin");
        kenarlar.add(scan.nextInt());

        System.out.println("3. Kenari girin");
        kenarlar.add(scan.nextInt());

        Collections.sort(kenarlar);

        boolean ucgen = kenarlar.get(2)-kenarlar.get(1)<kenarlar.get(0) &&
                kenarlar.get(2)-kenarlar.get(0)<kenarlar.get(1) &&
                kenarlar.get(1)-kenarlar.get(0)<kenarlar.get(2);

        System.out.println("Kenarlar bir ucgen olusturuyor mu? " + ucgen);
    }
}
