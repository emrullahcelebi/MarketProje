package StringManupilation;

import java.util.Scanner;

public class IndexOfOrnek {

    public static void main(String[] args) {

        /* Kullanicidan mail adresi isteyin. @ iceriyorsa "Mail adresiniz kabul edildi" ,
        icermiyorsa "Gecersiz mail adresi" yazdirin  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi girin");
        String mail = scan.next();

        if (mail.indexOf('@')==-1){
            System.out.println("Gecersiz mail adresi");
        } else {
            System.out.println("Mail adresiniz kabul edildi");
        }

    }
}
