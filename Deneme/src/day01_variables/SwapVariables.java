package day01_variables;

public class SwapVariables {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap`tan once sayi1: " + sayi1 + ", sayi2: " + sayi2 );

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Yeni sayi1: " + sayi1 + ", Yeni sayi2: " + sayi2);
        System.out.println("______________");

    }
}
