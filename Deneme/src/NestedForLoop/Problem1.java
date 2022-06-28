package NestedForLoop;

import java.util.Scanner;

public class Problem1 {

    /* Kullanicidan bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
    *
    * *
    * * *
    * * * *              */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir rakam giriniz");
        byte rakam = scan.nextByte();

        if (rakam<0 || rakam>9){
            System.out.println("Lutfen bir rakam giriniz");
        } else if (rakam==0) {
            System.out.println("0 ile sekil cizilemez");
        } else {
            for (int i = 1; i <=rakam ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}
