package CODING_BLOCKS_LEETCODE;

/*

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element
is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9

*/

import java.util.Arrays;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
