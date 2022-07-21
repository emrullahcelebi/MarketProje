package Inheritance;

public class Muhasebe extends Personel{
    protected int saatUcreti;
    protected String statu;
    protected int maas;

    public int maasHesapla(){
        maas = 8*25*saatUcreti;
        return maas;
    }

    public static void main(String[] args) {
        Muhasebe clsn1 = new Muhasebe();
        clsn1.isim="Ali";
        System.out.println(clsn1.soyisim); // null
    }

}
