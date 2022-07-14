package Replit4;

public class Array3 {
    /*
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
    Array = [20, 30, 25, 35, -16, 60, -100 ]
    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
     */
    public static void main(String[] args) {

        int arr[] = {20, 30, 25, 35, -16, 60, -100};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }

        double ort = (double) (toplam/arr.length);
        System.out.println("Array Sayılarının ortalaması: " + ort);
    }
}
