package MDArraysProblems;

import java.util.Arrays;

public class Problem5 {
    // Asagidaki MD Array`in ic arraylerdeki tum elemanlarin toplamini birer birer bulan ve hir sonucu
    //yeni bir arrayin elemani yapan ve yeni arrayi yazdiran bir program yazin

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5},{6,7}};

        int yeniArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                yeniArr[i]+=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
