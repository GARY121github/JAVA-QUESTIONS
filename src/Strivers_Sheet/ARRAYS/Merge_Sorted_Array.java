package Strivers_Sheet.ARRAYS;

// https://leetcode.com/problems/merge-sorted-array/

//[]
//        5
//        [3]
//        1

import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sorted_Array {
    public static void main(String[] args) {
//        nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] arr = {1,2,4,5,6,0};
        int m = 5;
        int[] brr = {3};
        int n = 1;
        merge_and_sort_solution_02(arr , m , brr , n);
        System.out.println(Arrays.toString(arr));
    }

//    GAP APPROACH
    static void merge_and_sort_solution_02(int[] arr , int m , int[] brr , int n){

//        MERGE ELEMENTS OF brr IN arr
        for(int i = m ; i < arr.length ; i++){
            arr[i] = brr[i - m];
        }

        int gap = ((m+n)%2==1)? ((m+n)/2 + 1):(m+n)/2;

        while(gap > 0){
            int p1 = 0;
            int p2 = gap;
            while (p2 < arr.length){
                if(arr[p1] > arr[p2]){
                    int temp = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = temp;
                }

                p1++;
                p2++;
            }

            gap=(gap%2==1 && gap!=1)?(gap/2+1):(gap/2);

        }

    }

//    3-POINTER APPROACH
    static void merge_and_sort_solution_01(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }
}
