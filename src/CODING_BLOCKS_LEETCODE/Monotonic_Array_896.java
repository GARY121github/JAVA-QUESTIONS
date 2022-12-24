package CODING_BLOCKS_LEETCODE;

/*

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing
if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.



Example 1:
Input: nums = [1,2,2,3]
Output: true

Example 2:
Input: nums = [6,5,4,4]
Output: true

Example 3:
Input: nums = [1,3,2]
Output: false


Constraints:

1 <= nums.length <= 10^5
-10^5 <= nums[i] <= 10^5

*/

public class Monotonic_Array_896 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(isMonotonic(arr));
    }

    static boolean isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0; i < arr.length-1 ; i++){
            if(arr[i] < arr[i+1]){
                decreasing = false;
            }
        }
        for(int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
        }
        if(increasing == false && !decreasing){
            return false;
        }
        else {
            return true;
        }
    }
}
