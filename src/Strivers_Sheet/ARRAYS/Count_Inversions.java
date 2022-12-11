package Strivers_Sheet.ARRAYS;

//https://www.codingninjas.com/codestudio/problems/count-inversions_615

import java.util.Scanner;
public class Count_Inversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextLong();
        }

//        System.out.println(getInversions(arr , n));

    }
}
