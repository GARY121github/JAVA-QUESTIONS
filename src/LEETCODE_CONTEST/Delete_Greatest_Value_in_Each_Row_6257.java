package LEETCODE_CONTEST;

import java.util.Arrays;

public class Delete_Greatest_Value_in_Each_Row_6257 {
    public static void main(String[] args) {
        int[][] arr =  {{10} };
        System.out.println(delete(arr));
    }
    static int delete(int[][] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            Arrays.sort(arr[i]);
        }

        int ans = 0;

        for(int col = arr[0].length - 1 ; col >= 0 ; col--){
            int temp_min = 0;
            for(int row = 0 ; row < arr.length ; row++){
                if(arr[row][col] > temp_min){
                    temp_min = arr[row][col];
                }
            }
            ans += temp_min;
        }

        return ans;
    }
}

