package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
        // Kullanicidan 2 tamsayi alip bu sayilari ve aralarindaki sayilari yazdirin

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Ayni soruyu while ile yapalim

        int i = baslangic;
        while (i<=bitis) {
            System.out.print(i + " ");
            i++; // baslangic variable`i degismesin diye
        }
    }
}

