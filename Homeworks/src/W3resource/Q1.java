package W3resource;

public class Q1 {
    /*
    Verilen bir arraydeki sayilardan array ortalamasindan buyuk olanlari bulan bir Java programi yazin.
    Beklenen cikti:
    Orijinal Array:
            [1, 4, 14, 7, 25, 3, 100]
    Array ortalamasi: 22.0
    Ortalamadan buyuk olan sayilar: 25 100
     */
    public static void main(String[] args) {

        int[] arr = {1, 4, 14, 7, 25, 3, 100};

        int ortalama = 0;
        for (int each :arr
             ) {
            ortalama+=each;
        }
        ortalama = ortalama/arr.length;

        System.out.println("Array ortalamasi: " + ortalama);
        System.out.print("Ortalamadan buyuk olan sayilar: ");
        for (int each:arr
             ) {
            if (each>ortalama) System.out.print(each + " ");
        }

    }
}
