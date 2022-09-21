package Arrays.Sorting.Questions;

//        Segregate 0s and 1s
//
//        Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.
//
//        Example 1:
//
//        Input:
//        N = 5
//        arr[] = {0, 0, 1, 1, 0}
//        Output: 0 0 0 1 1
//
//        Example 2:
//
//        Input:
//        N = 4
//        Arr[] = {1, 1, 1, 1}
//        Output: 1 1 1 1
//        Explanation: There are no 0 in the given array,
//        so the modified array is 1 1 1 1.
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function segregate0and1() which takes arr[] and n as input parameters and modifies arr[] in-place without using any extra memory.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
//
//
//        Constraints:
//        1 ≤ N ≤ 107
//        0 ≤ arri ≤ 1

import java.util.Scanner;

public class Sort_0_and_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT NUMBER OF TESTCASES");
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.println("INPUT THE SIZE OF AN ARRAY");
            int n = sc.nextInt();
            System.out.println("INPUT THE ELEMENTS IN ARRAY");
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            sort01(arr);
            for (int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void sort01(int arr[]){
        int s = 0 ;
        int e = arr.length - 1;
        while (s < e) {
            if(arr[s] == 1){
                if(arr[e] == 0){
                    int t = arr[s];
                    arr[s] = arr[e];
                    arr[e] = t;
                }
                e--;
            }
            else{
                s++;
            }
        }
    }
}

