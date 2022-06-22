package ForLoop;

import java.util.Scanner;

public class ForLoopCreation {
    public static void main(String[] args) {

        // Verilen stringi tersten yazdiran bir kod olusturunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = scan.nextLine();

        for (int i = str.length()-1 ; i>=0 ;  i--){
            System.out.print(str.substring(i,i+1));
        }
    }
}
