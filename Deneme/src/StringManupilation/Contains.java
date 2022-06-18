package StringManupilation;

import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {

        /* Kullanicidan email adresini girmesini isteyin. Mail
        @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        @gmail ile bitiyorsa "Email adresiniz kaydedildi"
        @gmail ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String mail = scan.next();

        if (mail.contains("@gmail.com")){
            if (mail.lastIndexOf("@gmail.com")==mail.length()-10){
                System.out.println("Email adresiniz kaydedildi");
            } else {
                System.out.println("Lutfen yazimi kontrol edin");
            }
        } else {
            System.out.println("Lutfen gmail adresi giriniz");
        }
    }
}
