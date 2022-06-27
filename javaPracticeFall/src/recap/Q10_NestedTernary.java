package recap;

import java.util.Scanner;

public class Q10_NestedTernary {
    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Final notunuzu giriniz");
        char not = scan.next().toUpperCase().charAt(0);

        System.out.println(not=='A' ? "Gayet Basarili" :
                not=='B' ? "Basarili" :
                not=='C' ? "Ha gayret" : "Digerleri..");
    }
}
