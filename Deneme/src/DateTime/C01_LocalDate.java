package DateTime;

import java.time.LocalDate;
public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now(); // Objenin olusturuldugu tarihi atar
        LocalDate baskaTrh = LocalDate.of(1995,10,18);
        // istenilen tarihe gore obje olusturur

        System.out.println(trh);
        // get`li methodlarla tarih ile ilgili detay bilgiler alinabilir
        System.out.println(trh.getDayOfMonth()); // kacinci ay
        System.out.println(trh.getDayOfWeek()); // hangi gun
        System.out.println(trh.getYear()); // 2022

        // Bir tarihten istedigimiz kadar ileri veya geri gidebilirix
        System.out.println(baskaTrh.minusWeeks(3)); // 1995-09-27
        System.out.println(baskaTrh.plusMonths(2).minusDays(3)); // 1995-12-15

        System.out.println(trh.isLeapYear()); // false

        System.out.println(trh.isAfter(baskaTrh)); // false

    }
}
