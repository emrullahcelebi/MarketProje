package Text;

public class Soru4_2 {
     /*
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
     */
     public static void main(String[] args) {
         int sayi1 = 100010;
         int sayi2 = 110010;

         int elde = 0;
         String toplam = "";
         int basToplam= 0;

         while (sayi1>0 || sayi2>0) {
             basToplam = sayi1%10 + sayi2%10 + elde;
             toplam = basToplam%2 + toplam;
             if (basToplam>=2) {
                 elde = 1;
             } else elde=0;
             sayi1/=10;
             sayi2/=10;
         }
         toplam = 1 + toplam;
         System.out.println(toplam);


     }
}
