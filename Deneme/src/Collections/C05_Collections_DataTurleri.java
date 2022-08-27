package Collections;

import java.util.ArrayList;
import java.util.List;

public class C05_Collections_DataTurleri {
    public static void main(String[] args) {

        List<String> liste = new ArrayList();
        //liste.add(5);
        //liste.add('s');
        //liste.add(true); String disinda kabul etmez

        List list = new ArrayList(); // = List<Object> list
        list.add("Ali");
        list.add(5);
        list.add('s');
        list.add(true); // ozellikle belirtmezsek object olur ve hepsinin atasi oldugu icin her seyi kabul eder

        System.out.println(list); // [Ali, 5, s, true]
        // Surekli data casting yapmak gerekebilir bu yuzden onerilmez
    }

}
