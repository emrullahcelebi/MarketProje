package Oca;

public class OcaMethodQuestion {

    private static long spuare(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int value = 9;
        long result = spuare(value);
        System.out.println(value);
    }


}

