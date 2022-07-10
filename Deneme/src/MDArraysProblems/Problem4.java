package MDArraysProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    // Alinan bir arrayde istenen bir degere esit olan elemanlari kaldirip kalanlari yeni bir array yapalim

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int son[] = new int[1];


        System.out.println(Arrays.toString(son));

        System.out.println("Kaldirilacak elemani giriniz");
        int kaldirilacak = scan.nextInt();
        String arrS = "";

        for (int i = 0; i <= son.length-1 ; i++) {
            if (son[i] != kaldirilacak){
                arrS+=son[i];
            }
        }
        int arrSon[] = new int[arrS.length()];
        for (int i = 0; i < arrS.length(); i++) {

        }
        System.out.println(Arrays.toString(arrSon));


    }
}
