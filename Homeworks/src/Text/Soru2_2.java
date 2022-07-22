package Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2_2 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        while (sayi>1) {
            if (sayi%2==0) {
                sayi/=2;
            } else if (sayi%3==0) {
                sayi/=3;
            } else if (sayi%5==0) {
                sayi/=5;
            } else {
                System.out.println("Ugly number degildir");
                break;
            }
        }
        if (sayi==1){
            System.out.println("Ugly number");
        }
    }
}
