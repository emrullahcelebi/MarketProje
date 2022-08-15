package RentCar.arac;

import RentCar.arac.opel.C01_Astra;
import RentCar.arac.opel.C02_Corsa;
import RentCar.arac.opel.C03_Insigna;
import RentCar.arac.toyota.C03_Auris;
import RentCar.arac.toyota.C01_Corolla;
import RentCar.arac.toyota.C02_Yaris;
import RentCar.arac.volvo.C03_S60;
import RentCar.arac.volvo.C01_V40;
import RentCar.arac.volvo.C02_XC90;
import RentCar.kullanici.MusteriBilgileri;

public class AracOlusturma {
    static MusteriBilgileri musteri = new MusteriBilgileri();
    public static void aracOlustur(int arabaTercih){


        switch (arabaTercih) {
            case 1 -> {
                C01_Astra astraKiralik = new C01_Astra();
                musteri.fiyatlar.add(astraKiralik.gunlukUcret);
            }
            case 2 -> {
                C02_Corsa corsaKiralik = new C02_Corsa();
                musteri.fiyatlar.add(corsaKiralik.gunlukUcret);
            }
            case 3 -> {
                C03_Insigna insignaKiralik = new C03_Insigna();
                musteri.fiyatlar.add(insignaKiralik.gunlukUcret);
            }
            case 4 -> {
                C01_Corolla corollaKiralik = new C01_Corolla();
                musteri.fiyatlar.add(corollaKiralik.gunlukUcret);
            }
            case 5 -> {
                C02_Yaris yarisKiralik = new C02_Yaris();
                musteri.fiyatlar.add(yarisKiralik.gunlukUcret);
            }
            case 6 -> {
                C03_Auris aurisKiralik = new C03_Auris();
                musteri.fiyatlar.add(aurisKiralik.gunlukUcret);
            }
            case 7 -> {
                C01_V40 v40Kiralik = new C01_V40();
                musteri.fiyatlar.add(v40Kiralik.gunlukUcret);
            }
            case 8 -> {
                C02_XC90 xc90Kiralik = new C02_XC90();
                musteri.fiyatlar.add(xc90Kiralik.gunlukUcret);
            }
            case 9 -> {
                C03_S60 s60Kiralik = new C03_S60();
                musteri.fiyatlar.add(s60Kiralik.gunlukUcret);
            }
        }
        KiralamaBilgileri.tarihSaat();
    }



}
