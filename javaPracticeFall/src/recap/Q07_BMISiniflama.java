package recap;

import java.util.Scanner;

public class Q07_BMISiniflama {
    /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double boy = scan.nextDouble();

        double bMI = kilo/(boy*boy);

        if (kilo<0 || boy<0 ){
            System.out.println("Lutfen verdiginiz bilgileri kontrol edin");
        } else if (bMI<=25) {
            System.out.println(bMI<=20 ? "oldukca zayifsiniz" : "Normal sinirlardasiniz");
        } else {
            System.out.println(bMI<=30 ? "Sisman kategorisindesiniz" : "Obez grubundasiniz");
        }
    }
}
