package IfProblems;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {

        /* Kullanicidan 4 basamakli bir sayi alin. Girdigi sayi 5`e bolunuyorsa son
        rakamini kontrol edin. Son rakam 0 ise ekrana "5`e bolunebilen cift sayi" yazdirin.
        Degilse "5`e bolunebilen tek sayi" yazdirin. Girdigi sayi 5`e bolunmuyorsa ekrana
        "Tekrar deneyin" yazdirin.  */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Girdiginiz sayi hatali");
        } else if (sayi%5==0) {
            if (sayi%10==0){
                System.out.println("5`e bolunebilen cift sayi");
            }else {
                System.out.println("5`e bolunebilen tek sayi");
            }

        } else {
            System.out.println("Tekrar deneyin");
        }
    }
}
