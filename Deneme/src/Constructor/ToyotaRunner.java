package Constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1 = new  Toyota();
        System.out.println(t1.marka); // Toyota
        System.out.println(t1.tekerAdedi); // 4
        System.out.println(t1.model); // null
        t1.model = "Corolla";
        t1.yakit = "Benzin";
        t1.yil = 2022;
        System.out.println("T1 model: " + t1.model + ", yakit: " + t1.yakit + ", yil: " + t1.yil);

        Toyota t2 = new Toyota();

    }
}
