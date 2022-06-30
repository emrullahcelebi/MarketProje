package Replit2;

public class Tr_If_Switch_Ternary_StringMethods_5 {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

    INPUT:
        Ay Numarasi:
        2
        Yil :
        2016

    OUTPUT :
        Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {

        int ay = 2;
        int yil = 2016;

        switch (ay){
            case 1: System.out.println("Ocak "+yil+" 31 Gundur."); break;
            case 2: System.out.println(yil%4==0?"Subat "+yil+" 29 Gundur.":
                "Subat "+yil+" 28 Gundur."); break;
            case 3: System.out.println("Mart "+yil+" 31 Gundur."); break;
            case 4: System.out.println("Nisan "+yil+" 30 Gundur."); break;
            case 5: System.out.println("Mayis "+yil+" 31 Gundur."); break;
            case 6: System.out.println("Haziran "+yil+" 30 Gundur."); break;
            case 7: System.out.println("Temmuz "+yil+" 31 Gundur."); break;
            case 8: System.out.println("Agustos "+yil+" 31 Gundur."); break;
            case 9: System.out.println("Eylul "+yil+" 30 Gundur."); break;
            case 10: System.out.println("Ekim "+yil+" 31 Gundur."); break;
            case 11: System.out.println("Kasim "+yil+" 30 Gundur."); break;
            case 12: System.out.println("Aralik "+yil+" 31 Gundur."); break;
        }
    }

}
