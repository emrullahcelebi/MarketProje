package DateTime;

import javax.swing.tree.FixedHeightLayoutCache;
import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1995,10,18);

        System.out.println(Period.between(dogumGunu,bugun)); // P26Y8M29D
        System.out.println(Period.between(dogumGunu,bugun).getDays());
        
    }
}
