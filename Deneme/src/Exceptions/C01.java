package Exceptions;

public class C01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        System.out.println(a/b); // 5

        b = 0;

        //System.out.println(a/b); // exception

        a = 100;
        b = 50;
        int sayac = 1;
    /*
    try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir
    catch`den sonra parantez karsilasmayi bekledigimiz exception turunu javaya soylemek icin kullanilir
    catch blogu javaya soyledigimiz istisna gerceklesirse javanin yapmasini istedigimiz islem
    catch blogunun onundeki paranteze karsilasmayi bekledigimiz exceptionu yazabilir veya her turlu
    exc da devreye girmesini istiyorsak exc larin parent`i olan Exception`i yazabiliriz
     */
        while (sayac<1000) {
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("Payda 0 oldu");
            }
            sayac++;
            b--;
        }


    }
}
