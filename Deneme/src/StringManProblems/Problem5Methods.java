package StringManProblems;

public class Problem5Methods {
    public static String kKNogizle(String kKNo) {
        String yeniKKNo = "**** **** **** "+kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyIsim) {
        String yeniIsim = isim.substring(0,1) + isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyIsim.substring(0,1) + soyIsim.substring(1).replaceAll("\\S","*");

        return yeniIsim + " " + yeniSoyisim;
    }
}
