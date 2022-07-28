package Overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        /*
        Bir obje olusturulurken constructor ve data turu ayni classtan secilmisse Java direkt o classa gider
        hem veriable hem methos icin o classda varsa kullanir yoksa o classin parentine gider
         */

        OverridingChild obj1 = new OverridingChild();

        obj1.method1(); // child
        obj1.method2(); // parent

        OverridingParent obj2 = new OverridingChild();
        obj2.method2(); // parent
        obj2.method1(); // child
        /*
        Eger data turu parent, constructor child ise veriable lar yukaridaki sekilde calisir.
        Methodlar icinse o classtaki method child class tarafindan Override edilmis mi diye kontrol etmemiz gerekir
        Eger child classlarda bu method Override edilmisse override eden method calisir
         */

        OverridingParent obj3 = new OverridingParent();
        obj3.method1(); // parent
        obj3.method2(); // parent
    }
}
