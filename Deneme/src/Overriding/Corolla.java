package Overriding;

public class Corolla extends Toyota{
    protected String hiz = "Corolla araclar max 200 km hiz yapar";
    protected String yakit = "Corolla benzinli veya elektriklidir";
    protected String model = "Corolla";

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 L yakit tuketir");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugundan obje constructorun bulundugu classin ozelliklerini tasirken
        data turu, veriable olarak data turu classinin ozelliklerini tasir
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hiz); // corolla
        System.out.println(arb1.yakit); // corolla
        System.out.println(arb1.marka); // toyota
        System.out.println(arb1.sirketMerkezi); // toyota
        System.out.println(arb1.model); // corolla
        arb1.motor(); //corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // araba
        System.out.println(arb2.hiz); // toyota
        System.out.println(arb2.yakit); // araba
        System.out.println(arb2.marka); // toyota
        System.out.println(arb2.sirketMerkezi); // toyota
        //System.out.println(arb2.model); // CTE
        arb2.motor(); // corolla

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // araba
        System.out.println(arb3.hiz); // araba
        System.out.println(arb3.yakit); // araba
        System.out.println(arb3.marka); // araba
        //System.out.println(arb3.sirketMerkezi); // CTE
        //System.out.println(arb3.model); // CTE
        arb3.motor(); // corolla

    }
}
