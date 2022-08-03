package Recursion;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        System.out.println(product(Math.max(a,b) ,Math.min(a,b)));
    }

    private static int product(int a, int b) {
        if(b==0)
            return 0;

        return a+product(a,b-1);
    }
}
