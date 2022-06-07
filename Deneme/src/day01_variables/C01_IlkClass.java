package day01_variables;

import java.sql.SQLOutput;

public class C01_IlkClass {
    public static void main(String[] args) {
        System.out.println("hello world");
        int level,yas,maas;
        level=5;
        yas=27;
        maas=3000;

        System.out.println(level);
        System.out.println(yas);
        System.out.println(maas);

        String isim="mami", soyisim="topcu";
        System.out.println(isim);
        System.out.println(soyisim);

        System.out.println(level+yas);

        System.out.println("isminiz : " + isim);
        System.out.println("soyisminiz : " + soyisim);

        short sayi1=3;
        double sayi2=5;
        System.out.println("Sayilarin Toplami : " + (sayi1+sayi2));

        char harf='M';
        System.out.println(harf);

        int sayi3=20;
        char harf2='k';
        System.out.println(sayi3 + harf2);// 127
        // char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir



    }

}
