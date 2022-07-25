package Replit7;

import java.util.Scanner;

public class Conditional_Statement_5 {
    /*
    1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun
    ve o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
     */
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month) {
            case 1:  System.out.println(year + " yili Ocak ayi 31 gun");    break;
            case 2:  System.out.println(year%4==0 ?  year +
            " yili Subat ayi 29 gun" : year + " yili Subat ayi 28 gun" );   break;
            case 3:  System.out.println(year + " yili Mart ayi 31 gun");    break;
            case 4:  System.out.println(year + " yili Nisan ayi 30 gun");   break;
            case 5:  System.out.println(year + " yili Mayis ayi 31 gun");   break;
            case 6:  System.out.println(year + " yili Haziran ayi 30 gun"); break;
            case 7:  System.out.println(year + " yili Temmuz ayi 31 gun");  break;
            case 8:  System.out.println(year + " yili Agustos ayi 31 gun"); break;
            case 9:  System.out.println(year + " yili Eylul ayi 30 gun");   break;
            case 10: System.out.println(year + " yili Ekim ayi 31 gun");    break;
            case 11: System.out.println(year + " yili Kasim ayi 30 gun");   break;
            case 12: System.out.println(year + " yili Aralik ayi 31 gun");  break;
        }
    }
}
