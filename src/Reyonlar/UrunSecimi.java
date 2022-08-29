package Reyonlar;

public class UrunSecimi {


    public static void urunSecimi() throws InterruptedException {


        Thread.sleep(2000);
        System.out.println("Secmek istediginiz urun id sini giriniz");

        double urunId=Secim.secim();
        if (urunId!=(int)urunId) {
            System.out.println("Lutfen gecerli id giriniz!!");
            urunId = Secim.secim();
            System.out.println("Kac kilo/adet istersiniz ");
            double kiloAdet = Secim.secim();
        }
//todo Map lerden secilen urunu cagirip musteriye bunu mu istedigini soracagiz

    }
}
