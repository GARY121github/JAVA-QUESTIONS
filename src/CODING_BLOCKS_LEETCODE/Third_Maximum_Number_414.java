package CODING_BLOCKS_LEETCODE;

/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.


Constraints:

1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1


*/
public class Third_Maximum_Number_414 {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(thirdMax(arr));
    }
    static int thirdMax(int[] nums) {
        int count = 0, max, mid, small;
        max = mid = small = Integer.MIN_VALUE;
        for (int num : nums) {
            if (count > 0 && num == max || count > 1 && num == mid) continue;
            count++;
            if (num > max) {
                small = mid;
                mid = max;
                max = num;
            } else if (num > mid) {
                small = mid;
                mid = num;
            } else if (num > small) {
                small = num;
            }
        }
        return count < 3 ? max : small;
    }
}
