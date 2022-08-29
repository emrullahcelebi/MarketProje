package Reyonlar;

import java.util.Scanner;

public class AnaMenu {



    public static void karsilama() throws InterruptedException {

        System.out.println("*********************Java Markete Hosgeldiniz*********************");
        Thread.sleep(2000);
        System.out.println("Lutfen secmek istediginiz reyonun numarasini giriniz...\n" +
                            "                     1- Manav\n" +
                            "                     2- Kasap\n" +
                            "                     3- Sarkuteri");

        double secim = Secim.secim();
        if (secim!=(int)secim){
            System.out.println("Lutfen gecerli secimi yapiniz!!");
            secim=Secim.secim();
        }

        switch ((int) secim){
            case 1: Manav.obj.listeYazdir();break;
            case 2:Kasap.obj.listeYazdir();break;
            case 3:Sarkuteri.obj.listeYazdir();break;
            default:
                System.out.println("Lutfen gecerli bir secim giriniz");
                Secim.secim();
        }


        UrunSecimi.urunSecimi();




    }





}
