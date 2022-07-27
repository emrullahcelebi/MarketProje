package W3resource;

import java.util.Scanner;

public class Q7 {
    /*
    Verilen bir Stringte tekrarlanmayan ilk karakterin indexini bulan bir Java programi yazin.
    Ornek Input: google
    Beklenen cikti:
    'google'da tekrarlanmayan ilk karakter: l, indexi: 4
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("String giriniz");
        String str = scan.nextLine();

        boolean varMi = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.length()-str.replace(str.substring(i,i + 1),"").length()==1) {
                varMi = true;
                System.out.println(str + "`da tekrarlanmayan ilk karakter: " + str.substring(i,i + 1) + ", indexi: " + i);
                break;
            }
        }
        if (!varMi) System.out.println("Tekrarlanmayan karakter yok");


    }
}
