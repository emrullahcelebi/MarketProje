package RentCar.kullanici;

import RentCar.arac.AracOlusturma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriBilgileri {

    static Scanner scan = new Scanner(System.in);
    public LocalDate alisTarihi;
    public LocalDate teslimTarihi;
    public String alinacakSehir;
    public int alisSaati;
    public int teslimSaati;
    public List<Double> fiyatlar = new ArrayList<>();
    public String adSoyad;
    public String yas;
    public String telefon;
    public String tc;
    public String aracBilgisi;

    public static void musteriBilgi(){
        System.out.print("Ad soyad giriniz: ");
        AracOlusturma.musteri.adSoyad = scan.nextLine();
        System.out.print("Yas giriniz: ");
        AracOlusturma.musteri.yas = scan.nextLine();
        System.out.print("Telefon numarasi giriniz: ");
        AracOlusturma.musteri.telefon = scan.nextLine();
        System.out.print("TC kimlik numarasi giriniz: ");
        AracOlusturma.musteri.tc = scan.nextLine();
    }

    @Override
    public String toString() {
        return
                        "Alinacak sehir: " + alinacakSehir +
                        "\nAlis tarihi: " + alisTarihi +
                        "\nAlis saati: " + alisSaati + ":00" +
                        "\nTeslim tarihi: " + teslimTarihi +
                        "\nTeslim saati: " + teslimSaati + ":00" +
                        "\nToplam tutar: " + fiyatlar.get(1) +
                        "\nAd soyad: " + adSoyad +
                        "\nYas: " + yas +
                        "\nTelefon: " + telefon +
                        "\nTC no: " + tc;

    }


}
