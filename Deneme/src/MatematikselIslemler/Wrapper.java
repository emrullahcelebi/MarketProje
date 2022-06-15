package MatematikselIslemler;

public class Wrapper {
    public static void main(String[] args) {

        String sayi1="12345";
        String sayi2="23456";

        // verilen iki stringteki sayiyi toplayin

        System.out.println(sayi1+sayi2); //1234523456
        System.out.println(Integer.valueOf(sayi1)+Integer.valueOf(sayi2)); //35801

        //Bir string ile sayisal bir data isleme sokulursa islem onceligine bakilir:
        String a="Hello";
        int b=2;
        int c=3;

        System.out.println(a+b+c); // Hello23 - hellodan sonra string oldu artik
        System.out.println(c+b+a); // 5Hello - mat islemi once yapildi sonra stringe dondu
        System.out.println(a+b*c); // Hello6 - carpma oncelikli islem oldugu icin once int sonra string oldu
        System.out.println(""+c+b+a); // 32Hello - "" yazarak iceriyi komple stringe cevirebiliriz


    }
}
