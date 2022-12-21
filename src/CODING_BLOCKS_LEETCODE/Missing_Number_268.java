package CODING_BLOCKS_LEETCODE;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing
from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since
it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range
since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since
it does not appear in nums.


Constraints:

n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.


Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

*/

import java.util.Arrays;

public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(solution_2(arr));
    }


    static int solution_1(int[] arr) {
        Arrays.sort(arr);
        int num = 0;
        for(int i = 0 ; i < arr.length ; i++ , num++){
            if(arr[i] != num){
                return num;
            }
        }
        return arr.length;
    }

//    SUM
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += i;
            sum -= nums[i];
        }
        sum += nums.length;
        return sum;
    }

    //binary search
    static int solution_2(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        return left;
    }
    //xor
    public int solution_3(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
