package day8_practice;

public class Q04_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        String str = "java ile her sey guzel";


        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 's': System.out.print("5"); break;
                case 'a': System.out.print("4"); break;
                case 'e': System.out.print("3"); break;
                case 'i': System.out.print("1"); break;
                case 'o': System.out.print("0"); break;
                default:  System.out.print(str.charAt(i));
            }
        }
    }

}
