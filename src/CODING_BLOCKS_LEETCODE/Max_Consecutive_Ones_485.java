package CODING_BLOCKS_LEETCODE;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/
public class Max_Consecutive_Ones_485 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOne(arr));
    }
    static int maxConsecutiveOne(int[] arr){
        int MaxConsecutiveOne = 0;
        int one = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                one++;
            }
            if(one > MaxConsecutiveOne){
                MaxConsecutiveOne = one;
            }

            if(arr[i] != 1){
                one = 0;
            }
        }
        return MaxConsecutiveOne;
    }
}
