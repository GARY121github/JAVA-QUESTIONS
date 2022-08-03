package Recursion;
//      Sankalp recently learned Fibonacci numbers and now he is studying different algorithms to find them.
//      After getting bored with reading them, he came with his own new type of numbers.
//      He defined them as follows:
//
//      -> f(0) = a;
//      -> f(1) = b;
//      -> f(n) = f(n-1) ^ f(n-2);  when n>1, where ^ denotes the bitwise xor operation.
//      You are given three integers a,b and n , calculate f(n).
//        Sample Input
//        4
//        86 77 15
//        93 35 86
//        92 49 21
//        62 27 90
//        Sample Outputs
//        86
//        126
//        92
//        62
import java.util.Scanner;
public class Unique_Fibo {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(fibo(a,b,n));
        }
    }

    public static int fibo(int a , int b , int n){
        if(n==0)
            return a;
        if(n==1)
            return b;
        if(n==2)
            return a^b;

        return fibo(a,b,n%3);
    }
}
