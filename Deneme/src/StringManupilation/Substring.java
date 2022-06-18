package StringManupilation;

public class Substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(9)); // IT cok guzel

        System.out.println(str.replace("ile", "calisiyorum cunku"));
        System.out.println(str.substring(0,5) + "calisiyorum cunku" + str.substring(8)); // usttekiyle ayni

        System.out.println(str.substring(7,7)); // ""
        //System.out.println(str.substring(5,2)); // hata

        System.out.println(str.substring(str.length()-1)); // son harf
        System.out.println(str.substring(str.length()-5)); // son 5 harf
        System.out.println(str.substring(str.length())); // "" verir - hiclik
    }
}
