package Strivers_Sheet.ARRAYS;

/*
There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.

This is one of those problems.

Please take extra care to make sure that you are type-casting your ints to long properly and at all places.
Try to verify if your solution works if number of elements is as large as 105

Food for thought :

Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly
so that the numbers do not overflow.
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n),
factorial(k) and then divide them.
Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4
*/

import java.util.*;

public class Repeat_and_Missing_Number_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();
                list.add(x);
            }

            System.out.println(Arrays.toString(missingAndRepeating(list , n)));
        }
    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        int[] ans = new int[2];
        int s = 0;
        int sp = 1;
        int e = n-1;
        int ep = n;
        while (s <= e){
            if(arr.get(s) != sp){
                ans[0] = sp;
            }

            if(arr.get(e) != ep){
                ans[0] = ep;
            }

            if(arr.get(s) == arr.get(s+1)){
                ans[1] = arr.get(s);
            }

            if(arr.get(e) == arr.get(e-1)){
                ans[1] = arr.get(e);
            }

            s++;
            sp++;
            e--;
            ep--;
        }

        return ans;
    }
}
