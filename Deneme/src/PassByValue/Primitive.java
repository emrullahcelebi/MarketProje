package PassByValue;

public class Primitive {
    public static void main(String[] args) {

        int a = 25;
        System.out.println("Method oncesi a = " + a);
        sayiYazdir(a);
        System.out.println("Method sonrasi a = " + a);
    }

    private static void sayiYazdir(int a) {
        System.out.println(a+1);
    }

    // Java Pass by value oldugu icin veriable`in kendisini degil degerini gonderir
}
