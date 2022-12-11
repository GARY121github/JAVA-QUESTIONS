package LEETCODE_CONTEST;

import java.util.Arrays;

public class Longest_Square_Streak_in_an_Array_6258 {
    public static void main(String[] args) {
        int[] arr = {4,3,6,16,8,2};
        System.out.println(SquareStreak(arr));
    }

    static int SquareStreak(int[] arr) {
        Arrays.sort(arr);
        int count = -1;
        for(int i = 0 ; i <= arr.length/2 ; i++){
            int temp_count = 0;
            long squ = ((long) arr[i])*arr[i];
            int searched_index = binarySearch(arr , squ);
            if(searched_index != -1) {
                temp_count++;
                while (true) {
                    squ = ((long) arr[searched_index])*arr[searched_index];
                    searched_index = binarySearch(arr, squ);
                    if (searched_index == -1) {
                        break;
                    } else {
                        temp_count++;
                    }
                }
                if (temp_count > count) {
                    count = temp_count;
                }
            }
        }
        return count;
    }

    static int binarySearch(int[] arr , long target){
        int s = 0 ;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            long square = ((long) arr[mid]) * arr[mid];
            if(square == target){
                return mid;
            }
            else if(square > target){
                e = mid-1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
