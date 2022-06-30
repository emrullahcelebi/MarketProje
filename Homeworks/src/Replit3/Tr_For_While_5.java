package Replit3;

public class Tr_For_While_5 {
    //100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
    //OUTPUT : 100 98 96 94 92 … … … … 2 0

    public static void main(String[] args) {

        int sayi = 100;
        String output = "";

        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                output = (i + " " +output);
            }
        }
        System.out.println(output.substring(0,output.length()-1));
    }
}
