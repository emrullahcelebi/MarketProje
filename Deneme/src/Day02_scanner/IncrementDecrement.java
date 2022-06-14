package Day02_scanner;

public class IncrementDecrement {
    public static void main(String[] args) {

        // Sayi artirmak 2 sekilde olabilir:
        int numA=5;
        numA=numA+3;

        //Veya:
        numA+=3;

        // carpma icin de gecerli:
        int numB=10;
        numB*=3; //30

        //sadece 1 artirmak icin:
        numA++; // numA+=1 demek

        // carpma ve bolme de yapilabilir:
        numA-=3;
        numB/=5;

        // 1 cikarma icin de kisayol var
        numA--;

        System.out.println(numA);
        System.out.println(numA + 5); // 5 fazlasini yazdirir
        System.out.println(numA+=3); // yeni deger atayip yazdirir
        System.out.println(numA); //yeni deger



    }
}
