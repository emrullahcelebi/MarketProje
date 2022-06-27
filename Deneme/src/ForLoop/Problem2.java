package ForLoop;

public class Problem2 {
    //[10,30] aralarinda virgulle yan yana yazdirin

    public static void main(String[] args) {

        int baslangic = 10;
        int bitis = 30;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i + ", ");
            }else {
                System.out.println(i);
            }
        }
    }
}
