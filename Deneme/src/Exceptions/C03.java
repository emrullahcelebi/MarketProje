package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03 {
    public static void main(String[] args) {
    /*
    Java`da bpc deki bir dosyaya ulasmak istiyorsak FileInputStream Class`indan yardim aliriz
    Ayni sekilde Javadan pcdeki bir dosyaya ekleme veya update yapmak istersek
    FileOutputStream Class`indan yardim aliriz.
     */
        int k;
        try {
            FileInputStream fis = new FileInputStream("src\\Exceptions\\Test.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi veya bozuk");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }
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
