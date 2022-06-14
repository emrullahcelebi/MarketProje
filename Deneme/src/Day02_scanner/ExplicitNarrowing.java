package Day02_scanner;

public class ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1= 879;
        double sayi2= 10;

        double sayi3= sayi1/sayi2;
        System.out.println(sayi3);
        // double>int oldugu icin java otomatik kabul eder
        // int olmasi icin manuel ayarlama lazim

        int sayi4= (int) (sayi1/sayi2);
        System.out.println(sayi4);
        // sagdaki int sorumluluk alma demek oluyor

        int sayi5= sayi1/(int)sayi2;
        System.out.println(sayi5);

        int sayi6= 140;
        byte sayi7= (byte)sayi6;

        System.out.println(sayi7);
        // Byte -128 ve +127 arasinda alir. 127den sonra kalan 13 -128den itibaren
        // 13 ilerleyip -116ya gelir.
    }
}
