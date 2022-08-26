package Interfaces;

public interface I01 {
    /*
    Interface bir class degildir

    Abstract classlar javada abstraction(soyutlastirma/Kural koyma) islerini yapiyorlardi
    Ancak abstract bir classta abstract olmayan methodlar da olabilir. Bu da full abstractiona izin vermez

    Eger javada icinde hic concrete method olmasin dediginiz bir class olusturmak istiyorsaniz
    bunu class degil interface yapmalisiniz.

    INTERFACE`DE CONCRETE METHOD OLAMAZ

    INTERFACELER FULL ABSTRACTION YAPTIGINDAN OBJE OLUSTURULAMAZ

    List interface`dir, alt classlarindan obje olusturulur ancak ArrayList gibi

    BIR CLASS ISTEDIGI KADAR INTERFACE`I PARENT EDINEBILIR

    INTERFACE`LER NEYIN YAPILMASI GEREKTIGINI SOYLER ANCAK NASIL YAPILACAGINA KARISMAZ

    INTERFACE`LERDE YAZSAK DA YAZMASAK DA TUM METHODLAR PUBLIC ABSTRACT`TIR

    VERIABLE`LAR ISE PUBLIC STATIC FINAL`DIR (BUYUK HARFLE YAZILIR VE DEGER ATANMAK ZORUNDA)

    EXTENDS DEGIL IMPLEMENTS YAZILIR

     */

    int SAYI = 20;

    static void yakit() {
        System.out.println("Yakit methodu");
    /*
    Interface icindeki tum methodlar public ve abstracttir

    abstract bir methodun body`si olamaz
    Java sonradan developerlarin istegi uzerine kismi bir update yapmistir

    Bir interface`e sonradan bir method eklerseniz ona bagli tum classlara override etmek zorunda kaliriz
    Bu da buyuk ve eskiden gelen projeler icin cok buyuk bir islemdir
    Java 8`den itibaren interfacelere body`si olan method eklemeye izin vermistir

    Bu methodlarin bodysi olsa da interface`in yapisi geregi bu methodlara concrete denilmez
    Body`si olan bu methodlar istisna olarak kabul edilebilir

    bu methodlara static eklenmelidir, veya default asagida gorundugu gibi
    static olursa childlar InterFaceAdi.MethodAdi ile ulasir
    default olursa obje uzerinden ulasir
     */
    };

    public default void teker(){
        System.out.println("Teker methodu");
    }
}
