package Recursion;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT THE NUMBER OF TEST CASES");
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(isPrime(n , 2));
        }
    }

    private static boolean isPrime(int n, int i) {
        if(n <= 3 )
            return true;
         if(n%i == 0)
             return false;
         if(i == n/2)
             return true;

         return isPrime(n , ++i);
    }
}
