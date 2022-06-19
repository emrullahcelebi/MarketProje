package StringManProblems;

public class Problem1 {
    public static void main(String[] args) {

        /* String seklinde verilen asagidaki fiyatlarin toplamlarini bulunuz */

        String str1 = "$13.99";
        String str2 = "$10.55";

        double fiyat1 = Double.parseDouble(str1.substring(1));
        double fiyat2 = Double.parseDouble(str2.substring(1));

        System.out.println("Toplam fiyat: " + (fiyat1+fiyat2));
    }
}
