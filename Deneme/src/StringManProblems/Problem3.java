package StringManProblems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin ve kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length()!=4){
            System.out.println("Lutfen kelime 4 harfli olsun");
        } else {
            System.out.println("" + kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));
        }
    }
}
