package StringManupilation;

public class Equals {

    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali" + " Can";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("== ile karsilastir: " + (str1==str2)); // true
        System.out.println("equals ile karsilastir: "+ str1. equals(str2)); //true

        String str3 = str1 + "";
        System.out.println("str3: " + str3);
        System.out.println("== ile karsilastir: " + (str1==str3)); // false
        System.out.println("equals ile karsilastir: "+ str1.equals(str3)); //true

        // == stringde her zaman ise yaramayabilir, equals tercih edilir

        String str4 = "ali can";
        System.out.println(str1.equalsIgnoreCase(str4)); // true - Buyuk-kucuk harfi onemsemez


    }
}
