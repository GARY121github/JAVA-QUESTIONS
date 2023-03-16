package CODING_BLOCKS_LEETCODE;

import java.util.Arrays;

public class SumClosest_3_16 {
    public static void main(String[] args) {

    }

    static int closest3Sum(int[] arr , int target){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int s = i+1;
            int e = arr.length - 1;

            while(s < e){
                int sum = arr[s] + arr[e] + arr[i];

                int diff = Math.abs(sum - target);

                if(diff == 0){
                    return sum;
                }

                if(diff < min){
                    min = diff;
                    ans = sum;
                }

                if(sum < target){
                    s++;
                }
                else {
                    e--;
                }

            }
        }

        return ans;
    }
}
