package day8_practice;

public class Q05_MDArray {

          /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
    public static void main(String[] args) {

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        int sayac = 0;

        for (int [] each1: arr
             ) {
            for (int each2: each1
                 ) {
                sayac++;
            }
        }

        System.out.println(sayac);

    }
}
