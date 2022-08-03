package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SONN(n));
    }

    private static int SONN(int n) {
        if(n == 0)
            return 0;
         return SONN(n-1)+n;
    }
}
