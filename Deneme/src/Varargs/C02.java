package Varargs;

public class C02 {
    public static void main(String[] args) {
        // Kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun

        String str1 = "Ali", str2 = "Veli", str3 = "Oguzhan", str4 = "Samet";

        enUzunKelime(str1, str2, str3, str4);
    }

    private static void enUzunKelime(String... str) {
        String enUzun = "";

        for (String each: str
             ) {
            if (each.length()>enUzun.length()) enUzun = each;
        }
        System.out.println(enUzun);
    }
}
