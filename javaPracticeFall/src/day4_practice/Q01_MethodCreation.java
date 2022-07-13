package day4_practice;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        String str = "aabbcccccddddaaa";

        stringYazdir(str);
    }

    private static void stringYazdir(String str) {
        String str2 = "";
        for (int i = 1; i <= str.length(); i++) {
            if (!str2.contains(str.substring(i-1,i))) {
                str2+=str.charAt(i-1);
            }
        }
        System.out.println(str2);
    }
}
