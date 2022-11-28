package LEETCODE_CONTEST;

/*

Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot
index for the given input.



Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.


Example 2:
Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.


Constraints:

1 <= n <= 1000


*/

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Pivot_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(pivot(N));
    }

//    n/2[2a + (n – 1)d]
    static int pivot(int N){
        for(int i = 1 ; i <= N ; i++){

//            LEFT SIDE SUM

            int left = 0;
            for(int j = 1 ; j <= i ; j++){
                left += j;
            }

//            RIGHT SIDE SUM
            int right = 0;
            for (int j = i ; j <= N ; j++){
                right += j;
            }

            if(left == right){
                return i;
            }
        }

        return -1;
    }
}
