package Final;

final public class C02 extends C01{
    // Bir class final ise inherit edilemez

    public static void main(String[] args) {

        C02 obj = new C02();
        obj.isim = "Alp";
        // obj.OKUL = "Java Koleji"; final oldugu icin degistirilemez

        System.out.println(OKUL); // final oldugu icin degistirilemez ve static oldugu icin direkt ulasilabilir
        obj.finalMethod();
    }
}
