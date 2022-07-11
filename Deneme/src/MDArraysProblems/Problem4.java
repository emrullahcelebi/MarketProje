package MDArraysProblems;

import java.util.Arrays;
import java.util.Scanner;

import static Arrays.MethodsArray.arrayOlustur;

public class Problem4 {
    // Alinan bir arrayde istenen bir degere esit olan elemanlari kaldirip kalanlari yeni bir array yapalim

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int arr[] =arrayOlustur();
        System.out.println("Array`iniz: " +Arrays.toString(arr));


        System.out.println("Kaldirilacak elemani giriniz");
        int kaldirilacak = scan.nextInt();
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != kaldirilacak) {
                str+= arr[i] + " ";
            }
        }

        String str2[] = str.trim().split(" ");
        int son[] = new int[str2.length];

        for (int i = 0; i <=str2.length-1 ; i++) {
            son[i] =(int) Double.parseDouble(str2[i]);
        }
        System.out.println(kaldirilacak+ " olmadan array: " +Arrays.toString(son));




    }
}
