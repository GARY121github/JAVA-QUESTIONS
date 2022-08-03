package Recursion;

import java.sql.SQLOutput;
import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
