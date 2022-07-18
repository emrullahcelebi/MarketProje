package day7_practice;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {

        String cumle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String cumle2 = cumle.replaceAll(" ", "");

        System.out.println(cumle2.length());
    }

}
