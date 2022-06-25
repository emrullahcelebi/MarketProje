package day1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen \"Y\" veya \"N\" yaziniz");
        char yn = scan.next().toUpperCase().charAt(0);

        if (yn == 'Y'){
            System.out.println("YES");
        } else if (yn == 'N') {
            System.out.println("NO");
        } else {
            System.out.println("Lutfen \"Y\" veya \"N\" yaziniz");
        }
    }

}
