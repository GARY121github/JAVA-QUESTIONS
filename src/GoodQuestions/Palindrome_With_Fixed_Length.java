package GoodQuestions;
//
//2217. Find Palindrome With Fixed Length :->
//
//        Given an integer array queries and a positive integer intLength, return an array answer where answer[i] is either the queries[i]th smallest positive palindrome of length intLength or -1 if no such palindrome exists.
//
//        A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.
//
//
//
//        Example 1:
//        Input: queries = [1,2,3,4,5,90], intLength = 3
//        Output: [101,111,121,131,141,999]
//        Explanation:
//        The first few palindromes of length 3 are:
//        101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, ...
//        The 90th palindrome of length 3 is 999.

//        Example 2:
//        Input: queries = [2,4,6], intLength = 4
//        Output: [1111,1331,1551]
//        Explanation:
//        The first six palindromes of length 4 are:
//        1001, 1111, 1221, 1331, 1441, and 1551.
//
//
//        Constraints:
//
//        1 <= queries.length <= 5 * 104
//        1 <= queries[i] <= 109
//        1 <= intLength <= 15

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome_With_Fixed_Length {


//    BRUTEFORCE :->
/*    public long[] kthPalindrome(int[] queries, int intLength) {
        ArrayList<Long> palin = new ArrayList<>();
        for(long i = (long)Math.pow(10,intLength - 1) ; i < (long)Math.pow(10,intLength) ; i++){
            if(isPalin(String.valueOf(i)))
                palin.add(i);
        }
        long ans[] = new long[queries.length];
        for(int i = 0 ; i < queries.length ; i++){
            if(queries[i] > palin.size())
                ans[i] = -1;
            else
                ans[i] = palin.get(queries[i]-1);
        }
        return ans;
    }
    boolean isPalin(String st){
        int s = 0;
        int e = st.length() - 1;
        while(s <= e)
        {
            if(st.charAt(s) != st.charAt(e))
                return false;

            s++;
            e--;
        }
        return true;
    }
 */

//    public long[] kthPalindrome(int[] queries, int intLength){
//        long ans[] = new long[queries.length];
//        int start = (int) Math.pow(10, intLength-1);
//        int end = (int) Math.pow(10, intLength) - 1;
//    }

//    OPTIMAL SOLUTION :->
    static long[] kthPalindrome(int[] queries, int intLength) {
        int start = (int) Math.pow(10, (intLength + 1) / 2 - 1);
        int end = (int) Math.pow(10, (intLength + 1) / 2);
        int mul = (int) Math.pow(10, intLength / 2);
        long[] ans = new long[queries.length];


        for (int i = 0; i < queries.length; ++i){
            if (start + queries[i] > end)
                ans[i] = -1;
            else
                ans[i] = getKthPalindrome(queries[i], start, mul, intLength);
        }
        return ans;
    }


    static long getKthPalindrome(int q, int start, int mul, int intLength) {

        long prefix = start + q - 1;

        return prefix * mul + reverse(intLength % 2 == 1 ? prefix / 10 : prefix);
    }

    static long reverse(long num) {
        long res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] queries = {1,2,3,4,5,90};
        int intLength = 3;
        long[] ans = kthPalindrome(queries, intLength);
        System.out.println(Arrays.toString(ans));

    }
}
