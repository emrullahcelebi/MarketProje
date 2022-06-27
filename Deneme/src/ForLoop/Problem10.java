package ForLoop;

import java.util.Scanner;

public class Problem10 {
    // Kullanicidan bir String isteyin ve palindrom olup olmadigini kontrol eden bir program yazin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String yeniCumle = "";

        for (int i = cumle.length()-1; i >=0 ; i--) {
            if (i == cumle.length()-1) {
                yeniCumle = yeniCumle.concat(cumle.substring(i));
            } else {
                yeniCumle = yeniCumle.concat(cumle.substring(i,i+1));
            }
        }

        if (yeniCumle.equalsIgnoreCase(cumle)){
            System.out.println("Cumleniz palindrom");
        } else {
            System.out.println("Cumleniz palindrom degil");
        }
    }
}
