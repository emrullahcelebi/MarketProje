package ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {

        // Kullanicidan cinsiyet ve yas bilgilerini alin. Kadin icin 60 yas ve ustu,
        // erkek icin 65 yas ve ustu emekli olabilir yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz. \nKadin icin K, \nErkek icin E yaziniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas<0 || yas>120){
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas<60) {
                System.out.println("Emekli olamazsin.\nDaha "+ (60-yas) + "sene calisman lazim");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'E') {
            if (yas<0 || yas>120){
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas<65) {
                System.out.println("Emekli olamazsin.\nDaha "+ (65-yas) + "sene calisman lazim");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }
    }
    }
