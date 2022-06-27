package ForLoop;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        //Kullanicidan 100den kucuk bir sayi isteyin. 1 den baslayip sayiya kadar olan 3un katlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");
        byte sayi = scan.nextByte();

        if (sayi<=0 || sayi>=100){
            System.out.println("Lutfen 100`den kucuk bir pozitif tam sayi giriniz");
        } else if (sayi<3) {
            System.out.println("3`un kati sayi bulunmuyor");
        } else {
            for (int i = 3; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
