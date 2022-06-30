package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_8 {
    /*
    Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
    Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String isim = scan.next();
        String isimSon2 = isim.substring(isim.length()-2);

        if (isim.length()<2){
            System.out.println("Isim cok kisa");
        } else {
            System.out.println(isimSon2+isimSon2+isimSon2);
        }
    }
}
