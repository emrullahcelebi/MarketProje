package day3_practice;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir String girin");
        String str = scan.nextLine();

        boolean xyz = xyzVarMi(str);
        System.out.println("xyz = " + xyz);
    }

    private static boolean xyzVarMi(String str) {
        boolean cevap = false;
        if (str.toLowerCase().contains("xyz")) cevap = true;
        return cevap;
    }
}
