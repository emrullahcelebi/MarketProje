package Abstract;

public class C01Child extends C01{ // Parent Abstract methodlari zorunlu ekletir
    @Override
    void carpma() {

    }
    /*
    Parent abstract - child concrete ise tum abstract methodlari almak zorunda
    Parent abstract - child da abstract ise istedigini alip istedigini birakabilir

    Concrete bir class parenti olan tum abstract calsslarda abstract olan methodlari implement etmek zorundadir
    Ancak parent silsilesinde override edilerek concrete hale gelen methodlari override etmek zorunda degildir

    Bir concrete class abstract bir class`in parenti olabilir

    abstract classlarda constructor vardir ama obje olusturulamaz
     */
}
