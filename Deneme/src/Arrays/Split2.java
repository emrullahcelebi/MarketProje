package Arrays;

public class Split2 {
    public static void main(String[] args) {

        String cumle = "Nerede o 'Hello world' yazdiramayan ogrenciler?";
        char  harf = 'e';
        // Verilen cumlede istenen harf kac kez yazdirilmis gosteren method olusturun

       int cevap = kullanimSayisi(cumle, harf);

        System.out.println("Cumlede harf " + cevap + " kez kullanilmis");
    }

    public static int kullanimSayisi(String cumle, char harf) {

        String arr [] = cumle.split("");
        String harfStr = ""+harf;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(harfStr)) {
                sayac++;
            }
        }


        return sayac;
    }

}
