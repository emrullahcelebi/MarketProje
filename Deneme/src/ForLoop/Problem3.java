package ForLoop;

public class Problem3 {
    //[100-50] aralarinda virgulle ayni satirda yazdirin

    public static void main(String[] args) {

        for (int i = 100; i >=50 ; i--) {
            if (i>50){
                System.out.print(i + ", ");
            }else {
                System.out.print(i);
            }
        }

    }
}
