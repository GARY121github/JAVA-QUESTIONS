package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = -123456789;
        System.out.println(SOD(number));
    }

    private static int SOD(int n) {
        if(n==0)
            return 0;

        return 1 + SOD(n/10);
    }
}
