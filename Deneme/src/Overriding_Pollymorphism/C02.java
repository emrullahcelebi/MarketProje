package Overriding_Pollymorphism;

public class C02 extends C01{

    @Override // Bu yazinin faydasi parent lasstaki silinirse uyari verir
    public void method2() {
        System.out.println("Child method 2");
    }
    @Override
    protected String method3(){

        return "Java";
    }

    public static void main(String[] args) {

        C02 obj = new C02();

        obj.method1(); // Parent method 1
        obj.method2(); // Child method 2

        C01 obj2 = new C02();
        obj2.method1(); // Parent method 1
        obj2.method2(); // Child method 2

        C01 obj3 = new C01();
        obj3.method1(); // Parent method 1
        obj3.method2(); // Parent method 2
    }
}
