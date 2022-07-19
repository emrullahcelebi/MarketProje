package FreeWork;

import java.util.Scanner;

public class Q6 {
    /*
      Array kullanarak verilen bir sayinin strobogrammatik sayi olup olmadigini kontrol eden bir Java programi yazin.
    NOT: Strobogrammatik sayilar goruntusu 180 derece dondurulunce yine ayni sayi olan sayilardir.
    Ornegin: 0, 1, 8, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818,
    888, 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009
    Ornek
    Input: 9006
    Output: 9006 strobogrammatik sayidir
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen bir dogal sayi giriniz");
        String sayi = scan.next();

        String arr [] = sayi.split("");

        boolean strobo = true;

        if (sayi.contains("2") || sayi.contains("3") || sayi.contains("4") ||
                sayi.contains("5") || sayi.contains("7")){
            strobo = false;
        } else {
            for (int i = 0; i <= arr.length/2; i++) {
                switch (Integer.parseInt(arr[i])) {
                    case 0: strobo = Integer.parseInt(arr[arr.length-i-1]) == 0; break;
                    case 1: strobo = Integer.parseInt(arr[arr.length-i-1]) == 1; break;
                    case 6: strobo = Integer.parseInt(arr[arr.length-i-1]) == 9; break;
                    case 8: strobo = Integer.parseInt(arr[arr.length-i-1]) == 8; break;
                    case 9: strobo = Integer.parseInt(arr[arr.length-i-1]) == 6; break;
                }
                if (!strobo) break;
            }
        }
        System.out.println(strobo ? sayi + " strobogrammatik sayidir": sayi + " strobogrammatik sayi degildir");


    }
}
