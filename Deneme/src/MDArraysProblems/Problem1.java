package MDArraysProblems;

public class Problem1 {
    // Asagidaki MD array`in tum elemanlarinin carpimini yazdiran bir method yazdirin

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6}};

        int carpim = 1;

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                carpim*=arr[i][j];
            }

        }
        System.out.println("carpim = " + carpim);
    }
}
