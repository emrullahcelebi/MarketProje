package ForLoop;

import java.util.Scanner;

public class Problem9 {
    //Kullanicidan bir string isteyin ve stringi tersine ceviren bit method yazdirin

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
        System.out.print(yeniCumle);
    }
}
