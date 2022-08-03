package Recursion;

//        Power of Two :-
//
//        Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//        An integer n is a power of two, if there exists an integer x such that n == 2x.
//        Example 1:
//        Input: n = 1
//        Output: true
//        Explanation: 2^0 = 1
//        Example 2:
//
//        Input: n = 16
//        Output: true
//        Explanation: 2^4 = 16
//        Example 3:
//
//        Input: n = 3
//        Output: false

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to be checked weather it is power of two or not?");
        int n = sc.nextInt();

        System.out.println(approach1(n));

        System.out.println(approach2(n));

        System.out.println(approach3(n));

        System.out.println(RecursiveApproach(n));
    }

    private static boolean RecursiveApproach(int n) {

        if(n<=0)
            return false;
        if(n%2 == 0)
            return RecursiveApproach(n/2);
        if(n == 1)
            return true;

        return false;

    }

    private static boolean approach3(int n) {

        double t = Math.log(n) / Math.log(2);
         return t - (int)t == 0;
    }

    //    Using bit-manipulation
//        2^0 = 1 =>  01       &       0 =>  00         == 0
//        2^1 = 2 =>  10       &       1 =>  01         == 0
//        2^2 = 4 =>  100      &       3 =>  011        == 0
//        2^3 = 8 =>  1000     &       7 =>  0111       == 0
//        2^4 = 16 => 10000    &       15 => 1111       == 0
//
    private static boolean approach2(int n) {
        if(n < 1)
            return false;

        return (n & n-1) == 0;
    }

//    Using simple itteration
    private static boolean approach1(int n) {
        if(n < 1)
            return false;

        while (n%2 == 0)
            n = n/2;

        return n==1 ;
    }

}
