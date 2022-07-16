package day6_practice;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("String giriniz");
        String str = scan.nextLine().trim();
        System.out.println("Tekrar sayisi giriniz");
        int tekrar = scan.nextInt();

        String ilkSon = "" + str.charAt(0)+str.charAt(str.length()-1);

        for (int i = 0; i < tekrar; i++) {
            System.out.print(ilkSon);
        }
    }
}
