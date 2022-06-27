package recap;

import java.util.Scanner;

public class Q02_YolHizZaman {
    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        100 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz");
        double mesafe = scan.nextDouble();

        System.out.println("Hizi giriniz");
        int hiz = scan.nextInt();

        double sure= mesafe/hiz;

        int sure2= (int)sure;

        if (mesafe<=0 || hiz<=0) {
            System.out.println("Lutfen girdiginiz bilgileri kontrol ediniz");
        } else if (sure==sure2) {
            System.out.println("Sure: " + sure2 + " saat");
        } else {
            System.out.println("Sure: " + sure2 + " saat " + (int)(60*(sure-sure2)) + " dakika");
        }
    }
}
