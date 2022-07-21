package Constructor;

public class ConstructorCall {

    int x = 5;
    ConstructorCall(){
        System.out.println("-x" + x);
    }
    ConstructorCall(int x) {
        this(); // cons cagirdi, parametrelere gore - ilk sayira yazilmak zorunda
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        ConstructorCall mc1 = new ConstructorCall(4); //-x5
                                                        //-x5

        ConstructorCall mc2 = new ConstructorCall(); //-x5
    }
}
