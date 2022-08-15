package RentCar.kullanici;

import RentCar.arac.opel.C01_Astra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MusteriBilgileri {
    /*
    MusteriConstructor olabilir

    2-araclardan tercihini alınız.
      eger musteri farklı bir arac talep ederse
      talep ettigi aracın fields'larını alınız.
      musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile
      arac tercihine ve islemine gore odemesini gerçekleştriniz..

     */

    public LocalDate alisTarihi;
    public LocalDate teslimTarihi;
    public String alinacakSehir;
    public int alisSaati;
    public int teslimSaati;
    public List<Double> fiyatlar = new ArrayList<>();


}
