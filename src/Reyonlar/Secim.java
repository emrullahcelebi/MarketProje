package Reyonlar;


import java.util.Scanner;

public class Secim {
    static Scanner scan=new Scanner(System.in);

    public static double secim(){
        double secim=0;
        do {
            try {
                secim =scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Lutfen numara giriniz!");
            }
            if (secim<0){
                System.out.println("Lutfen gecerli bir secim giriniz!");
            }else break;

        }while (true);
      return secim;
    }

}
