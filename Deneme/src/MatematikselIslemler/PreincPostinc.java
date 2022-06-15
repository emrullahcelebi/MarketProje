package MatematikselIslemler;

public class PreincPostinc {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println(sayi); // 10

        sayi++;
        System.out.println(sayi); // 11

        System.out.println(++sayi); // 12 - once artirir sonra yazdirir
        System.out.println(sayi); //12

        System.out.println(sayi++); // 12 - once yazdirir sonra artirir
        System.out.println(sayi); //13

        int sayi2=sayi++; // once sayi2 atanir sonra sayi artirilir
        System.out.println(sayi2); // 13
        System.out.println(sayi); //14

    }
}
