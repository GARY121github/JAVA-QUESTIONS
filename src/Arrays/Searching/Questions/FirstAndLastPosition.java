package Arrays.Searching.Questions;

import java.util.Arrays;

/*
    Find First and Last Position of Element in Sorted Array.

    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]

    Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

    Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]


    Constraints:

    0 <= nums.length <= 105
    -10^9 <= nums[i] <= 10^9
    nums is a non-decreasing array.
    -109 <= target <= 109
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5 , 7 , 7 , 8 , 8 , 10 };
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums , target)));
    }

        static int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int[] a = {-1 , -1};
        while(s <= e){
            int mid = s + ((e-s)>>1);
            if(nums[mid] == target){
                a[0]=mid;
                e = mid-1;
            }
            else if(nums[mid] < target)
                s = mid+1;
            else if(nums[mid] > target)
                e = mid-1;
        }
        s = 0;
        e = nums.length - 1;
        while(s <= e){
            int mid = s + ((e-s)>>1);
            if(nums[mid] == target){
                a[1]=mid;
                s = mid+1;
            }
            else if(nums[mid] < target)
                s = mid+1;
            else if(nums[mid] > target)
                e = mid-1;
        }
        return a;
    }
}
