package Text;

import java.util.List;
import java.util.Scanner;

public class Soru6 {
    /*
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
    Test Data:
    isPrime(31)
    true
    isPrime(18)
    false
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        List<Integer> asal = Soru2.asalCarpanlaraAyir(scan.nextInt());

        System.out.println(asal.size()==0 ? "true" : "false");;

    }
}
