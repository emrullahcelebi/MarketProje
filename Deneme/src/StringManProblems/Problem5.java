package StringManProblems;

import java.util.Scanner;

public class Problem5 {
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

        String yeniIsim = isim.substring(0,1) + isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyIsim.substring(0,1) + soyIsim.substring(1).replaceAll("\\S","*");
        String yeniKKNo = "**** **** **** "+kKNo.substring(12);

        System.out.println("isim-soyisim: " + yeniIsim + " " + yeniSoyisim + "\nkart no: " +yeniKKNo);
    }
}
