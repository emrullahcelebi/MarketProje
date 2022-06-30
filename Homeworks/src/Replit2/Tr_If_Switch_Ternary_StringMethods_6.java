package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_6 {
    /*
    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
    Eger aynı karakterlere sahipse
    "isim ayni karakterlere sahiptir." yazdirin.
    Eger ayni kaakterlere sahip degilse
    "Dizenin benzersiz karakterleri var" yazdirin.
    Ternary kullanin.
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String isim = scan.next();

        String son3 = isim.substring(isim.length()-3).toLowerCase();
        boolean benzer = son3.charAt(0)==son3.charAt(1)
                || son3.charAt(1)==son3.charAt(2) || son3.charAt(0)==son3.charAt(2);

        System.out.println(benzer ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var");
    }
}
