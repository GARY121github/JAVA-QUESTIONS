package Bitwise;

import java.util.Scanner;

/*
    HACKER-RANK (MEDIUM) :->
        https://www.hackerrank.com/challenges/counter-game/problem

 */
public class CounterGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            String result = counterGame(n);
            System.out.println(result);
        }
    }



//    Brute force way, but it will give TLE(Time Limit Error).
    public static String counterGame(long n) {

         int i = 0;
         while(n != 1)
         {
             if((n & (n-1)) == 0)
             n = n/2;
             else
             {
                 int len = (int) (Math.log(n) / Math.log(2));
                 long num = (1L << len);
                 n = n - num;
             }
             i++;
         }
         if((i & 1) == 0)
         return "Richard";
         else
         return "Louise";

    }


}
