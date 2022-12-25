package CODING_BLOCKS_LEETCODE;

/*

Given an array arr of size N and an integer K. The task is to find the pair of integers in the array such that their sum is maximum
but less than K.

Note:Out of every possible pair, find pair with a maximum absolute difference.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
The first line of each test case contains N and K, where N is the number of elements in the array and K is the bound. The second
line of each test case contains the array elements.

Output:
Print the pair with the maximum sum less than K.

Your task:
You don't have to take input. Complete the function Max_Sum(), which takes the array, N and K as parameters and returns the pair
of integer if exist else return pair of zeros (0,0). The printing is done by the driver code.

Constraints:
1 ≤ T ≤ 10
0 ≤ N ≤ 105
0 ≤ K ≤ 10^6
0 ≤ arr[i] ≤ 10^5

Example:
Input:
2
6 10
2 3 4 6 8 10
6 0
2 3 4 6 8 10
Output:
3 6
0 0

Explanation:
Testcase 1: Pair (3,6) has a maximum sum equals 9 which is less than 10.
Testcase 2: There doesn't exist any pair in the array with a sum less than 0.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pair_with_largest_sum_which_is_less_than_K_in_the_array_GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(Max_Sum(arr , k));
        }
    }

    static ArrayList<Integer> Max_Sum(int[] arr, int k) {
        int s = 0;
        int e = arr.length-1;
        int first = 0;
        int second = 0;
        int max = 0;

        Arrays.sort(arr);

        while (s < e){
            int sum = arr[s] + arr[e];
            if(sum < k){
                if(sum > max){
                    first = arr[s];
                    second = arr[e];
                    max = sum;
                }
                s++;
            }
            else{
                e--;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        return list;
    }
}
