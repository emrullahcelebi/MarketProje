package day7_practice;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {

        int [][] arr = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min = arr[0][0];

        for (int[] each1: arr
             ) {
            for (int each2: each1
                 ) {
                if (each2<min) min = each2;
            }
        }
        System.out.println("min: " + min);
    }

}
