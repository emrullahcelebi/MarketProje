package Text;

import java.util.Scanner;

public class Soru5 {
    /*
    Saati saniyeye çeviren java methodunu yazınız.
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen saat girin");
        howManySeconds(scan.nextInt());
    }

    private static void howManySeconds(int nextInt) {
        System.out.println(nextInt*3600);
    }
}
