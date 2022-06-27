package ForLoop;

public class Problem8 {
    // [10,20] 0.2 artirarak yazin

    public static void main(String[] args) {

        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;

        for (double i = baslangic; i <= bitis; i+=0.2) {
            System.out.print(i + " ");
        }
    }
}
