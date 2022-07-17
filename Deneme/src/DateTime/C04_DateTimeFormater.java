package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormater {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");

        // Simdi formatter ve tarihSaati birlestircez

        System.out.println(formatter.format(tarihSaat));

        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(formatterSaat.format(tarihSaat));


        /*
            Format olustururken;
            GUN
          d  : basta 0 varsa onu yazmadan gun numarasi
          dd : basta 0 varsa o da dahil gun numarasi
          DDD: yilin kacinci gunu oldugu yazar
          E, EE, EEE : gun isminin ilk 3 harfi
          EEEE: gun isminin tamami

          Ay (Ay icin M dakika icin m)
          M    : basta 0 varsa onu yazmadan ay numarasi
          MM   : basta 0 varsa o da dahil ay numarasi
          MMM  : ay isminin ilk 3 harfi
          MMMM : ay isminin tamami

          YY : yilin son 2 rakami
          YYYY: yilin tamami

          SAAT (24 saat uzerinden istiyorsak H, 12 istiyorsak h)
          HH : saatin tamami, tek rakamli saat olursa 02 gibi
          H  : tek rakamliysa tek rakamli

          a yazarsam am-pm yazar

          DAKIKA
          m : dakika
          mm: dakika tamami

         */
    }
}
