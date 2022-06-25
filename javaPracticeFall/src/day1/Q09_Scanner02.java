package day1;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isim-soyisim giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket = scan.next();

        System.out.println("Lutfen su an nerede bulundugunuzu giriniz");
        String konum = scan.next();

        System.out.println("Yasadiginiz yeri seviyor musunuz?");
        scan.nextLine();
        String yerSev = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = scan.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = scan.nextDouble();


        System.out.println(isim);
        System.out.println(konum + "`da yasiyor");
        System.out.println("Memleketi " + memleket + " ve yasadigin yeri seviyor musun sorusuna " +yerSev + " dedi");
        System.out.println("Yasi: " + yas + ", boyu: " + boy);
    }




}
