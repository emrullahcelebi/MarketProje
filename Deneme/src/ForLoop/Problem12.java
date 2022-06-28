package ForLoop;

import java.util.Scanner;

public class Problem12 {
    // Kullanicidan 10`dan kucuk bir sayi isteyin ve faktoriyelini bulun

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen 10`dan kucuk bir dogal sayi giriniz");
        byte sayi = scan.nextByte();

        int faktoriyel = 1;

        if (sayi<0 || sayi>=10){
            System.out.println("Lutfen 10`dan kucuk bir dogal sayi giriniz");
        } else if (sayi==0) {
            System.out.println("0!=1");
        }else {
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel *= i;
            }
            System.out.println(sayi + "!=" + faktoriyel);
        }
    }
}
