package Replit2;

public class Tr_If_Switch_Ternary_StringMethods_3 {
    /*
    Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
    Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

    INPUT :
        25
        46
    OUTPUT :
        Numaralarin Toplami:
        71
     */
    public static void main(String[] args) {

        long sayi1 = 25;
        long sayi2 = 46;

        if (sayi1>=1000000000 || sayi2>=1000000000) {
            System.out.println("OverFlow");
        } else {
            System.out.println("Numaralarin Toplami: \n" + (sayi1+sayi2));
        }
    }
}
