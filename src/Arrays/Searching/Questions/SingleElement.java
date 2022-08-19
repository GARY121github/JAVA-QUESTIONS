package Arrays.Searching.Questions;
/*
    Single Element in a Sorted Array.
    You are given a sorted array consisting of only integers where every element appears exactly twice,
    except for one element which appears exactly once.
    Return the single element that appears only once.

--> Your solution must run in O(log n) time and O(1) space.
    Example 1:
    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2

    Example 2:
    Input: nums = [3,3,7,7,10,11,11]
    Output: 10

    Constraints:

    1 <= nums.length <= 105
    0 <= nums[i] <= 105

 */
public class SingleElement {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {

        int start = 0, end = nums.length - 1, mid;

        // For Edge Cases
        if (nums.length
                == 1) // If only one element is in the array
            return nums[0];

        if (nums[start]
                != nums[start + 1]) // If the first element
            // is the element that
            // appears only once
            return nums[start];

        if (nums[end]
                != nums[end
                - 1]) // If Last element is the element
            // that appears only once
            return nums[end];

        // Binary Search
        while (start <= end) {
            mid = start + (end - start) / 2;
            // CASE 1
            if (nums[mid] != nums[mid - 1]
                    && nums[mid] != nums[mid + 1])
                return nums[mid];
                // CASE 2 and CASE 3
            else if ((nums[mid] == nums[mid + 1]
                    && mid % 2 == 0)
                    || (nums[mid] == nums[mid - 1]
                    && mid % 2 != 0))
                start = mid + 1;
                // CASE 4 and CASE 5
            else
                end = mid - 1;
        }
        // If no such element found
        return -1;
    }
}
