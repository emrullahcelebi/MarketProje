package Encapsulation;

public class C01_2 {

    public static void main(String[] args) {

        C01 obj = new C01();

        System.out.println(obj.getSayi()); //0

        obj.setStr("JAVA JAVA JAVA");
        System.out.println(obj.getStr()); // JAVA JAVA JAVA

        System.out.println(obj); // toString varsa direkt yazdirabilir
        // C01{sayi=0, str='JAVA JAVA JAVA'}
    }
}
