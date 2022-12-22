package CODING_BLOCKS_LEETCODE;

/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-2^31 <= nums[i] <= 2^31 - 1


*/

import java.util.Arrays;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroesToRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroesToRight(int[] arr) {
        int p = 0;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
            else{
                arr[p++] = arr[i];
            }
        }
        for(int i = p ; i < arr.length ; i++){
            arr[i] = 0;
        }
    }
}
