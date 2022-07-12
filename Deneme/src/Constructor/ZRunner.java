package Constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1 = new Z("Emre", "Gulser", 44, true);
        System.out.println(obj1);

        Z obj2 = new Z("Emre", "GuL", 55);
        System.out.println(obj2);
    }
}
