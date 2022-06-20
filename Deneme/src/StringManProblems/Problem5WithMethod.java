package StringManProblems;

import java.util.Scanner;

public class Problem5WithMethod {
    public static void main(String[] args) {

        /* Kullanicidan isim - soyisim ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin:
        isim-soyisim: M***** T****
        kart no: **** **** **** 1234 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = scan.next().toUpperCase();

        System.out.println("Lutfen soyisim giriniz");
        String soyIsim = scan.next().toUpperCase();

        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String kKNo = scan.next();

        String gizliIsimSoyisim = Problem5Methods.isimSoyisimGizle(isim,soyIsim);
        String gizliKKNo = Problem5Methods.kKNogizle(kKNo);

        System.out.println(gizliIsimSoyisim + "\n" + gizliKKNo);
    }


}
