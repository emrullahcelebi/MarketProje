package Replit2;

import java.util.Scanner;

public class Tr_If_Switch_Ternary_StringMethods_2 {
    /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
    Input :
    John White
    1234234534561478
    Output : Name :
    J*** W****
    CCN : **** **** **** 1478
    Ilk Harfler Buyuk harf ile baslamalidir.
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Isim:");
        String isim = scan.nextLine();

        System.out.println("Soyisim");
        String soyIsim = scan.nextLine();

        System.out.println("Kart no:");
        String kKNo = scan.nextLine();

        String isimGizli = isim.toUpperCase().substring(0,1) +
                isim.substring(1).replaceAll("\\w","*");

        String soyIsimGizli = soyIsim.toUpperCase().substring(0,1) +
                soyIsim.substring(1).replaceAll("\\w","*");

        String cCN = "**** **** **** " + kKNo.substring(12);

        System.out.println("Name : \n"+isimGizli+" "+soyIsimGizli);
        System.out.println("CCN : "+cCN);

    }
}
