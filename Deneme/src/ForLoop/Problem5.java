package ForLoop;

import java.util.Scanner;

public class Problem5 {
    //Kullanicidan 100den kucuk bir sayi isteyin. 1 den baslayip sayiya kadar olan 3un katlarini yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");

        byte sayi = scan.nextByte();

        if (sayi <= 0 || sayi >= 100) {
            System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");
        } else if (sayi < 3) {
            System.out.println("3`un veya 5`in kati olan sayi bulunmuyor");
        } else {
            for (int i = 3; i <= sayi; i++) {
                System.out.print(i % 3 == 0 || i % 5 == 0 ? (int)i + " " : "");
            }
        }
    }
}

