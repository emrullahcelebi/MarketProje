package day7_practice;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {

        String[][] str = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam = 0;

        for (String[] each1: str
             ) {
            for (String each2: each1
            ) {
                if (each2.contains("$")){
                    toplam += Double.parseDouble(each2.replaceAll("\\D",""))*3.2;
                } else if (each2.contains("€")){
                    toplam += Double.parseDouble(each2.replaceAll("\\D",""))*4.2;
                }
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
