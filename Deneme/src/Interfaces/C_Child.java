package Interfaces;

public class C_Child implements I01, I02{
    /*
    Bir class`i bir interface`e child yapmak icin implements kullanilir, virgul ile birden cok yazilabilir
    Interface interface`e child yapmak icin yine extends kullanilir
    bir interface bir classi parent edinemez

    2 interfacede ayni isimde ama farkli return type olan method varsa ayni anda implement edilemez
     */

    public static void main(String[] args) {
        System.out.println(I02.SAYI); // iki implement interfacede de ayni isimde veriable varsa
        System.out.println(I01.SAYI); // interface ismi ile beraber yazilir
        System.out.println(ISIM);

        I01.yakit(); // istisna static bodyli method
        C_Child obj = new C_Child();
        obj.teker(); // istisna default obje uzerinden ulasildi
    }
}
