package Overriding_Pollymorphism;

public class C01 {

    protected void method1(){ // override edilen method daha dar veya ayni genislikte modifier olmali
        System.out.println("Parent method 1 ");
    }

    public void method2(){
        System.out.println("Parent method 2 ");
    }

    protected String method3(){

        return "Java";
    }

    // Overriding method covariant return type olmali. Long - int gibi
    // Private - Static ve Final methodlar override edilemez
}
