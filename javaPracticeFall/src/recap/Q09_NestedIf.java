package recap;

import java.util.Scanner;

public class Q09_NestedIf {
    /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<0 || yas>120){
            System.out.println("Gecersiz yas");
        } else if (yas<50) {
            System.out.println(yas>=18 ? "bir kez oy kullanabilir" : "Oy kullanamaz");
        } else {
            System.out.println(yas<70 ? "iki kez oy kullanabilir" : "uc kez oy kullanabilir");
        }
    }
}
