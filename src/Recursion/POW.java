package Recursion;
//
//        Pow(x, n)
//        Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//        Example 1:
//        Input: x = 2.00000, n = 10
//        Output: 1024.00000
//        Example 2:
//        Input: x = 2.10000, n = 3
//        Output: 9.26100
//        Example 3:
//        Input: x = 2.00000, n = -2
//        Output: 0.25000
//        Explanation: 2-2 = 1/22 = 1/4 = 0.25
//
//        Constraints:
//
//        -100.0 < x < 100.0
//        -231 <= n <= 231-1
//        -104 <= xn <= 104


import java.util.Scanner;

public class POW {

    public static double myPow(double x, int n) {

        double h = helper(x , Math.abs(n));

        if(n < 0)
            return 1.0 / h;

        return h;
    }

    public static double helper(double x , int n){

        if(n == 0)
            return 1;
        else if(n == 1)
            return x;

        if((n&1) == 0)
            return helper(x*x , n/2);

        else
            return x*helper(x*x , n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT THE NUMBER");
        double x = sc.nextDouble();
        System.out.println("INPUT THE POWER");
        int n = sc.nextInt();

        System.out.println(myPow(x , n));
    }
}
