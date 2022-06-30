package Replit3;

import java.util.Scanner;

public class Tr_For_While_3 {
    /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
    Input :
        String str=“Javaisalsoeasy”
    Output: a s
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String str = scan.nextLine();
        String output = "";

        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.substring(i+1).contains(str.substring(i,i+1))) {
                if (!output.contains(str.substring(i, i + 1))) {
                    output = output + str.substring(i, i + 1) + " ";
                }
            }
        }
        System.out.println(output);
    }
}
