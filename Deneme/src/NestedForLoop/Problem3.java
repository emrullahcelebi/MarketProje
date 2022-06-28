package NestedForLoop;

public class Problem3 {
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    seklini yazdiriniz ('A'`nin ASCII degeri 65)
     */

    public static void main(String[] args) {

        int sayi = 6;
        char harf = 64;

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(harf + j) +" ");
            }
            System.out.println("");
        }

        // veya
        char input = 'F';

        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
