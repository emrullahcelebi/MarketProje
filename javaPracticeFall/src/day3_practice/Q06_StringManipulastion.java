package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir String girin");
        String str = scan.nextLine();

        boolean boslukVarMi = false;

        if (str.length()==0){
            System.out.println("String bos");
        } else if (str.contains(" ")){
            System.out.println("String space iceriyor");
        } else {
            System.out.println("Stringte bosluk yok");
        }


    }
}
