package Exceptions;

public class C04 {
    public static void main(String[] args) {

        String str = "12345";

        int sayi = Integer.parseInt(str);

        System.out.println("Sayinin karesi: " + sayi*sayi);

        str = "123a5";
        try {
            sayi = Integer.parseInt(str);
            System.out.println("Sayinin karesi: " + sayi*sayi);
        } catch (NumberFormatException e) {
            System.out.println("Stringte rakam disi karakter var");
        }catch (Exception e) {
            System.out.println("Bir hata var");
        }
    }
}
