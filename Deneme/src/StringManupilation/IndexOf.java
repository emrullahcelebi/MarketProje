package StringManupilation;

public class IndexOf {

    public static void main(String[] args) {

        String str1 = "Java bir baska guzel";

        System.out.println(str1.indexOf('J')); // Char olarak indexi verir = 0

        System.out.println(str1.indexOf("l")); // String olarak indexi verir = 19
        System.out.println(str1.length()-1); // yukardekinin diger yolu = 19

        System.out.println(str1.indexOf("aska")); // tek bir harfmis gibi dusunup baslangic indexini verir=10

        System.out.println(str1.indexOf("b")); // ilk buldugunu getirir = 5
        System.out.println(str1.indexOf('b',5)); // 5. indexten itibaren arar = 5
        System.out.println(str1.indexOf('b',6)); // 9

        System.out.println(str1.indexOf('a', str1.indexOf('a')+1)); // 2. a`nin indexi
        System.out.println(str1.indexOf('y')); // yok`un satisal degeri -1dir. = -1

    }
}
