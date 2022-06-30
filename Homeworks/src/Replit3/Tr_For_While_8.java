package Replit3;

public class Tr_For_While_8 {
    //'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.println("Ascii value of "+ i + " = " +(int)i);
        }
    }
}
