package Recursion;

/*
Given a number n, check whether it’s prime number or not using recursion.
Examples:


Input : n = 11
Output : Yes

Input : n = 15
Output : No
*/

import java.util.Scanner;

public class Recursive_program_for_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n , 2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static boolean isPrime(int n , int i){

        if(n%i == 0){
            return false;
        }

        if(i > Math.sqrt(n)){
            return true;
        }

        return isPrime(n , i+1);
    }
}
