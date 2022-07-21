package Inheritance;

public class Isci extends Muhasebe{
    protected String meslek;
    protected String sendika;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.meslek = "kaynakci";
        isci1.saatUcreti = 20;
        isci1.isim = "Muhammet";
        isci1.maas = isci1.maasHesapla();
        System.out.println(isci1.isim + "`in maasi = " + isci1.maas);
    }
}
