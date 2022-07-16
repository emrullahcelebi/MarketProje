package day6_practice;

public class Q09_Arrays {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

     */
    public static void main(String[] args) {

        int [][] arr1 = { {0,2,-1}, {3,8,9}, {7} };
        int[][] arr2 = { {-7,6,-9}, {0,12}, {19} };

        int toplam1 = mDToplamBul(arr1);
        int toplam2 = mDToplamBul(arr2);

        int toplam = toplam1+toplam2;

        System.out.println("1. Array`in toplami: " + toplam1);
        System.out.println("2. Array`in toplami: " + toplam2);
        System.out.println("2 Array`in toplami: " + toplam);
    }

    private static int mDToplamBul(int[][] array) {
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toplam += array[i][j];
            }
        }
        return toplam;
    }
}
