package ifElseStatements;

public class If {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {
            System.out.println("verilen sayilar esit"); // yazmaz
        }

        if (a < b) {
            System.out.println("a, b`den kucuk");
        }

        if (a * b > 5) {
            System.out.println("sayilarin carpimi 5den buyuk");
        }

        // suslu parentezsiz if calisir ancak sadece tek satir, noktali virgule kadar
        if (a<b && b>2){
            System.out.println("ilk satir calisti");
            System.out.println("ikinci satir calisti");
        }

        if (a<0) System.out.println("ilk satir calisti"); //bu satir sadece if oldu
        System.out.println("ikinci satir calisti"); // bu ifin disinda kalmis oldu


    }
}
