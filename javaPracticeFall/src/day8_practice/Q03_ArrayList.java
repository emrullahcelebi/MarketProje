package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int input [] = {1,2,3,4,5,6,7,8};
        int inpt = 2;

        List<Integer> list = new ArrayList<Integer>();
        int kucuk = input[0];
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j]<=kucuk){
                    kucuk = input[j];
                    index = j;
                }
            }
            list.add(kucuk);
            kucuk= Integer.MAX_VALUE;
            input[index] = Integer.MAX_VALUE;

        }
        System.out.println(list);

        for (int i = list.size() - 1; i >= list.size()-inpt; i--) {
            System.out.print(list.get(i) + " ");
        }


    }
}
