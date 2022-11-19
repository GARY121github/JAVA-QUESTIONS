package Strivers_Sheet.ARRAYS;

//https://leetcode.com/problems/next-permutation/

import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        nextPermutation(arr);
    }

    static void nextPermutation(int[] arr){

        int p1 = 0;
//        FIND THE FIRST CONSECUTIVE SMALL ELEMENT
        for(int i = arr.length - 2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                p1 = i;
                break;
            }
        }

        int p2 = 0;
//        FIND THE ELEMENT SMALLER THAN THE ELEMENT AT P1
        for(int i = arr.length - 1; i > p1 ; i--){
            if(arr[i] > arr[p1]){
                p2 = i;
                break;
            }
        }

//        EDGE TEST CASE ---> THE NUMBER IS BIGGEST NUMBER

        if(p1==0 && p2 == 0){
            reverse(arr , p1 , arr.length - 1);
            System.out.println(Arrays.toString(arr));
            return;
        }

//        SWAP THE ELEMENTS AT P1 AND P2

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        reverse(arr , p1+1 , arr.length-1 );
        System.out.println(Arrays.toString(arr));
        System.out.println(p1 + " --> " + p2);



    }

    static void reverse(int[] arr , int s ,int e){
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }
    }
}
