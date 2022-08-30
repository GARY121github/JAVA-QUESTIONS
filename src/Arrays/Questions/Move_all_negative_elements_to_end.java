package Arrays.Questions;

//      Given an unsorted array arr[] of size N having both negative and positive integers.
//      The task is place all negative element at the end of array without changing the order
//      of positive element and negative element.
//        Example 1:
//        Input :
//        N = 8
//        arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//        Output :
//        1  3  2  11  6  -1  -7  -5
//
//        Example 2:
//        Input :
//        N=8
//        arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
//        Output :
//        7  9  10  11  -5  -3  -4  -1
//
//        Your Task:
//        You don't need to read input or print anything.
//        Your task is to complete the function segregateElements() which takes the array arr[]
//        and its size N as inputs and store the answer in the array arr[] itself.

//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(N)

import java.util.Arrays;
import java.util.Scanner;

public class Move_all_negative_elements_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        segregateElements(arr , n);
        System.out.println(Arrays.toString(arr));
    }
    static void segregateElements(int arr[], int n)
    {
        // Create an empty array to store result
        int temp[] = new int[n];

        // Traversal array and store +ve element in
        // temp array
        int j = 0; // index of temp

        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        // If array contains all positive or all
        // negative.
        if (j == n || j == 0)
            return;

        // Store -ve element in temp array
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        // Copy contents of temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        // Your code goes here
    }
}
