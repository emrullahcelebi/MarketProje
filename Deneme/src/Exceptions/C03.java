package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C03 {
    public static void main(String[] args) throws FileNotFoundException {
    /*
    Java`da bpc deki bir dosyaya ulasmak istiyorsak FileInputStream Class`indan yardim aliriz
    Ayni sekilde Javadan pcdeki bir dosyaya ekleme veya update yapmak istersek
    FileOutputStream Class`indan yardim aliriz.
     */

        FileInputStream fis = new FileInputStream("src\\Exceptions\\Test.txt");
        /*
        Compile timeda altini cizen her durum CTE degildir.
        Javada bazi exc lar da Compile Time Exc dir
        Ozellikle okuma ve yazma ile ilgili exc lar compile timedir

        Comp time exc olustugunda Java cozum icin 2 ihtimal onerir
        1)Try/Catch
        2)Method signature a throws + exc eklemek, cozmez kabul eder sadece
         */
    }
}
