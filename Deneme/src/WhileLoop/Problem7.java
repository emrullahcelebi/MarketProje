package WhileLoop;

import java.util.Scanner;

public class Problem7 {
    /*
    Kullanicidan bir rakam alin ve bu rakam icin carpim tablosu yazdirin.
    Kullanicinin hata yapmadigini farz edin. Ornegin 3 girilirse:
    3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir rakam giriniz");
        int sayi = scan.nextInt();
        int carpi= 1;

        while (carpi<=10) {
            System.out.print(sayi+"x"+carpi+"="+(sayi*carpi)+" ");
            carpi++;
        }
    }
}
