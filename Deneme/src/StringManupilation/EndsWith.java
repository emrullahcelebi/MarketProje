package StringManupilation;

import java.util.Scanner;

public class EndsWith {

    public static void main(String[] args) {

         /* Kullanicidan email adresini girmesini isteyin. Mail
        @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        @gmail ile bitiyorsa "Email adresiniz kaydedildi"
        @gmail ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz");
        String mail = scan.nextLine();
        String aranan = "@gmail.com";

        if (!mail.contains(aranan)) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (mail.endsWith(aranan)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
