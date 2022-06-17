package StringManupilation;

public class Concate {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "candir";

        System.out.println(str1 + " " + str2); // Java candir

        String cumle = str1.concat(str2);
        System.out.println(cumle); //Javacandir

        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle); // Java candir

        cumle = str1.concat(""+5); // string disi bir sey yazilacaksa string hale getirilmeli

    }
}
