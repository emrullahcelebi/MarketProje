package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_4 {
    /*
    Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
    yanıt a ise, "Talebiniz işleniyor" mesajı yazdırılır
    yanıt b ise, "yine de ilgilendiğiniz için teşekkür ederiz"
    yanıt c ise, "Üzgünüz, şu anda herhangi bir yardım yok"
    başka herhangi bir yanıt değeri için,
    "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("A-B-C Harflerinden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        if (harf=='A' || harf=='B') {
            System.out.println(harf=='A' ? "Talebiniz isleniyor" : "yine de ilgilendiginiz icin tesekkur ederiz");
        }else {
            System.out.println(harf=='C' ? "Uzgunuz, su anda herhangi bir yardim yok" :
                    "Gecersiz giris, lutfen tekrar deneyin!");
        }
    }
}
