package DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // saat, dk, sn, nanosaniye

        System.out.println("Loop oncesi time: " + tm);

        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }

        LocalTime loopSonrasi = LocalTime.now();
        System.out.println("Loop sonrasi time: " + loopSonrasi);

        double nano1 = tm.getNano();
        double nano2 = loopSonrasi.getNano();

        System.out.println("Islem " + (nano2-nano1) + " nanosaniyede bitti");
    }
}
