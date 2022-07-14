package Text;

public class Soru1 {
    /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <=13; j++) {
                if (j<=6-i || j>7+i){
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 6; i >=0; i--) {
            for (int j = 0; j <=13; j++) {
                if (j<=6-i || j>7+i){
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println("");
        }
    }
}
