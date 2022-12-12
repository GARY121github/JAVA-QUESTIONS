package LEETCODE_CONTEST;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Square_Streak_in_an_Array_6258 {
    public static void main(String[] args) {
        int[] arr = {4,3,6,16,8,2};
        System.out.println(SquareStreak(arr));
    }

    static int SquareStreak(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = -1;
//        for(int i = 0 ; i < arr.length ; i++){
//            int temp_count = 0;
//            int elemet_found_at_index = binarySearch(arr , arr[i] * arr[i]);
//            if(elemet_found_at_index != 1){
////                temp_count++;
//
//                while (elemet_found_at_index != -1){
//                    System.out.println("Element found at index --> " + elemet_found_at_index);
//                        temp_count++;
//
//                        int t = arr[elemet_found_at_index] * arr[elemet_found_at_index];
//                        elemet_found_at_index = binarySearch(arr , t);
////                        elemet_found_at_index = binarySearch(arr , );
//                }
//
//                if(temp_count > count){
//                    count = temp_count;
//                }
//            }
//        }

        int first_index = binarySearch(arr , arr[0]*arr[0]);
        System.out.println(first_index);
        int second_index = binarySearch(arr , arr[first_index] * arr[first_index]);
        System.out.println(second_index);
        int third_index = binarySearch(arr , arr[second_index] * arr[second_index]);
        System.out.println(third_index);

        return count;
    }

    static int binarySearch(int[] arr , int target){
        System.out.println("target -> " + target);
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int mid = s + (e - s)/2 ;
            int square = arr[mid] * arr[mid];
            System.out.println(mid + "--->>>>");
            System.out.println(square);
            if(square == target){
                return mid;
            }
            else if(square < target){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
