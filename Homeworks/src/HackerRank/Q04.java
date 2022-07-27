package HackerRank;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (n>=0 && n<=20){
            System.out.println(n==2||n==4 ? "Not Weird" : "Weird");
        } else if (n%2==0){
            System.out.println("Not Weird");
        } else System.out.println("Weird");
    }
}
