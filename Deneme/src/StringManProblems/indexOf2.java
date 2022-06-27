package StringManProblems;

public class indexOf2 {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        int kelimeIlkIndex = cumle.indexOf(kelime); //0
        int kelimeSonIndex = cumle.lastIndexOf(kelime); //16

        System.out.println(kelimeIlkIndex);
        System.out.println(kelimeSonIndex);

        if (kelimeIlkIndex == -1) {
            System.out.println("Verilen kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("Verilen kelime cumlede sadece 1 kere kullanilmiş");
        } else {
            System.out.println("Verilen kelime cumlede birden fazla kullanilmis");
        }

    }
}
