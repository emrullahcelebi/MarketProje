package Replit5;

import java.util.Arrays;
import java.util.List;

public class Array7 {
    /*
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
    */
    public static void main(String[] args) {

        String arr [] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> liste = Arrays.asList(arr);
        System.out.println(liste);
    }
}
