package StringBuilder;

public class C03 {
    public static void main(String[] args) {
        /*
        Copmpare iki sb`i esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz, farkli olan ilk karakter icin ASCII farkini yazdirir
        ikisi de sb olmalidir, string kabul etmez
         */
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("ali Can");

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.insert(7, "dan" )); // Ali Candan

        System.out.println(sb1.reverse()); // nadnaC ilA
        System.out.println(sb1); // nadnaC ilA
        System.out.println(sb1.reverse()); // Ali Candan

        sb1.setCharAt(4,'K');
        System.out.println(sb1); // Ali Kandan

        System.out.println(sb1.substring(4)); // Kandan
        System.out.println(sb1); // Ali Kandan

        System.out.println(sb1.subSequence(4,7)); // Kan
        System.out.println(sb1); // Ali Kandan



    }
}
