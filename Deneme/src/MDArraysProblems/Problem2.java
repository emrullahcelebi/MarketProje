package MDArraysProblems;

public class Problem2 {
    // Asagidaki MD Arrayin ic arraylerinin son elemanlarinin carpimini yazdirin

    public static void main(String[] args) {

        int arr [][] = {{1,2,3},{4,5},{6}};

        int carpim = 1;

        for (int i = 0; i <= arr.length-1; i++) {
            carpim*= arr[i][arr[i].length-1];
        }
        System.out.println("carpim = " + carpim);
    }
}
