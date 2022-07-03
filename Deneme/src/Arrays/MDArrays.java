package Arrays;

public class MDArrays {
    public static void main(String[] args) {

        int [][] arr = {{3,1,7},{6,10,2}};
        // verilen MD Array`in elemanlari toplamini bulunuz

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+= arr[i][j];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
