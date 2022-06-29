package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_1 {
    /*
    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
    IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
    BMI 18,5'in altındaysa zayıfsınız
    BMI 18,5 ile 25 arasında ise kilonuz idealdir
    BMI 25-30 arasındaysa şişmansınız
    BMI 30'dan büyük veya eşitse, obez

    Input:
        Agirlik : 71
        Boy : 1,72
        BMI : 23.99945916711736

    Output:
        Zayifsiniz.
     */

    public static void main (String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double boy = scan.nextDouble();

        double bMI = kilo/(boy*boy);

        if (kilo<0 || boy<0 ){
            System.out.println("Lutfen verdiginiz bilgileri kontrol edin");
        } else if (bMI<=25) {
            System.out.println("BMI: " + bMI);
            System.out.println(bMI<=18.5 ? "zayifsiniz" : "kilonuz idealdir");
        } else {
            System.out.println("BMI: " + bMI);
            System.out.println(bMI<=30 ? "şişmansınız" : "obez");
        }
    }

}
