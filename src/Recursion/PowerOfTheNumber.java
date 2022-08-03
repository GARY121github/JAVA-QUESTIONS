package Recursion;

//    WAP to check wheather a number is the power of the given number or not ?

import java.util.Scanner;

public class PowerOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT THE NUMBER OF TEST CASES");
        int t = sc . nextInt();
        while (t-- > 0){
            System.out.println("INPUT THE POWER NUMBER");
            int p = sc.nextInt();
            System.out.println("INPUT THE NUMBER TO BE CHECKED");
            int n = sc.nextInt();

            System.out.println(isPower(p , n));

//            Shortest way to check
//            double num = Math.log(n) / Math.log(p);
//            System.out.println(num - (int)num == 0);

        }
    }

    private static boolean isPower(int p, int n) {

        if(n <= 0)
            return false;
        if(n%p == 0)
            return isPower(p , n/p);
        if(n == 1)
            return true;

        return false;
    }
}
