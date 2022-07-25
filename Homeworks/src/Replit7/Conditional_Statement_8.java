package Replit7;

public class Conditional_Statement_8 {
    /*
    1 den 10 a kadar her satırda bir artırarak piramit şekli oluşturan Java kodunu yazınız.
     */
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
