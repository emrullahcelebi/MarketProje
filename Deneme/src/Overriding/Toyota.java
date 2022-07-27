package Overriding;

public class Toyota extends Araba{

    protected String hiz = "Toyota araclar max 220 km hiz yapar";
    protected String marka = "Toyota";
    protected String sirketMerkezi = "Japonya";

    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanirlar");
    }

    public void garanti() {
        System.out.println("Toyota araclar 10 yil garantilidir");
    }
}
