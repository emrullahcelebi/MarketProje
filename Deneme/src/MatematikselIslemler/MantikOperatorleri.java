package MatematikselIslemler;

public class MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8); //false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8; //true

        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8; //false
        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8; //false
        System.out.println(sonuc3);

        // 15`in 10 ve 20 arasinda oldugunu gosterin:
        int sayi3=15;
        System.out.println(sayi3>10 && sayi3<20);

        //4`un 10 ve 20 arasinda olmadigini gosterin
        int sayi4= 4;
        System.out.println(sayi4<10 || sayi4>20);


    }
}
