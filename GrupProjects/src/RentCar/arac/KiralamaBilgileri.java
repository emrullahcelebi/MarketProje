package RentCar.arac;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KiralamaBilgileri {

    static Scanner scan = new Scanner(System.in);

    public static void tarihSaat(){

        System.out.print("Kiralamak istediginiz sehri giriniz: ");
        AracOlusturma.musteri.alinacakSehir = scan.next();

        System.out.println("Kiralama baslangic tarihi icin:");
        System.out.print("Ay numarasi giriniz: ");
        int ay = scan.nextInt();
        System.out.print("Gun numarasi giriniz: ");
        int gun = scan.nextInt();
        System.out.print("Saati giriniz (00-23): ");
        AracOlusturma.musteri.alisSaati = scan.nextInt();
        AracOlusturma.musteri.alisTarihi = LocalDate.of(2022,ay,gun);

        System.out.println("Teslim tarihi icin:");
        System.out.print("Ay numarasi giriniz: ");
        ay = scan.nextInt();
        System.out.print("Gun numarasi giriniz: ");
        gun = scan.nextInt();
        System.out.print("Saati giriniz (00-23): ");
        AracOlusturma.musteri.teslimSaati = scan.nextInt();
        AracOlusturma.musteri.teslimTarihi = LocalDate.of(2022,ay,gun);
        fiyatHesaplama();

    }

    public static void fiyatHesaplama(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period period =Period.between(AracOlusturma.musteri.alisTarihi,AracOlusturma.musteri.teslimTarihi);

        int hesap = period.getMonths()*30+period.getDays();
        if (AracOlusturma.musteri.teslimSaati> AracOlusturma.musteri.alisSaati){
            hesap++;
        }
        hesap*=AracOlusturma.musteri.fiyatlar.get(0);
        System.out.println(dtf.format(AracOlusturma.musteri.alisTarihi)+" "+AracOlusturma.musteri.alisSaati+":00");
        System.out.println(dtf.format(AracOlusturma.musteri.teslimTarihi)+" "+AracOlusturma.musteri.teslimSaati+":00");
        System.out.println("Toplam kiralama bedeli: " + hesap + " TL");
    }





}
