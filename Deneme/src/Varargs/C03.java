package Varargs;

public class C03 {
    public static void main(String[] args) {
        // Parametre olarak bir int ve istedigimiz kadar String alan ve en uzun kelimenin
        // Harf sayisi ile int parametre degerini carpip sonucu yazdiran bir method olusturun

        int sayi = 5;
        String str1 = "Helal", str2 = "Zulal", str3 = "WowWowHaram";

        carpim(sayi, str1, str2, str3);
    }

    private static void carpim(int sayi, String... str) { // Vararg kullanacaksak sonda olmali
        String enUzun = "";
        for (String each: str
        ) {
            if (each.length()>enUzun.length()) enUzun = each;
        }
        System.out.println("Istenen deger = " + sayi*enUzun.length());
    }
}
