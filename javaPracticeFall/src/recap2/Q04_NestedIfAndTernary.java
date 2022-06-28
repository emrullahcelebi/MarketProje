package recap2;

public class Q04_NestedIfAndTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {

         int sayi = 9;
         String sonucIf = "";

         if (sayi>=0 && sayi<=9) {
             if (sayi == 9) {sonucIf = "dokuz";}
             else if (sayi==8) {sonucIf="sekiz";}
             else if (sayi==7) {sonucIf="yedi";}
             else if (sayi==6) {sonucIf="alti";}
             else if (sayi==5) {sonucIf="bes";}
             else if (sayi==4) {sonucIf="dort";}
             else if (sayi==3) {sonucIf="uc";}
             else if (sayi==2) {sonucIf="iki";}
             else if (sayi==1) {sonucIf="bir";}
             else sonucIf="sifir";
         }else sonucIf="gecersiz";

         System.out.println("sonucIf = " + sonucIf);

         /* ******************************************************************************************************/

         String sonucTern = sayi==9 ? "dokuz" : sayi==8 ? "sekiz" : sayi==7 ? "yedi" : sayi==6 ? "alti" :
                 sayi==5 ? "bes" : sayi==4 ? "dort" : sayi==3 ? "uc" : sayi==2 ? "iki" : sayi==1 ? "bir" :
                         sayi==0 ? "sifir" : "gecersiz";
         System.out.println("sonucTern = " + sonucTern);
     }
}
