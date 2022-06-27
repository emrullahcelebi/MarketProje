package ForLoop;

import java.util.Scanner;

public class Problem6 {
    /*
    Kullanicidan 100den kucuk bir tam sayi isteyin.
    1`den baslayarak girilen sayiya kadar tum sayilari yazdirin ancak:
    sayi 3`un katiysa sayi yerine "Java"
    sayi 5`in katiysa sayi yerine "Guzeldir"
    sayi hem 3`un hem 5`in katiysa "Java Guzeldir" yazdirin
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");
        byte sayi = scan.nextByte();

        if (sayi< 0 || sayi > 100){
            System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");
        } else {
            for (int i = 1; i <=sayi ; i++) {
                if (i%15==0){
                    System.out.print("Java Guzeldir ");
                } else if (i%3==0){
                    System.out.print("Java ");
                } else if (i%5==0) {
                    System.out.print("Guzeldir ");
                } else {
                    System.out.print(i + " ");
            }
            }
        }
    }
}
