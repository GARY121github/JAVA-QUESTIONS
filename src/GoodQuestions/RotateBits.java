package GoodQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list = rotate(n , d);
        System.out.println(String.valueOf(list));
    }

    static int[] intoBinary(int n){
        int[] arr = new int[16];
        int p = arr.length - 1;
        while (n > 0){
            int t ;
            if(n % 2 == 0){
                t = 0;
            }
            else {
                t = 1;
            }

            arr[p--] = t;
            n = n / 2;
        }
//        arr[p] = 1;
        return arr;

    }
    static ArrayList<Integer> rotate(int n, int d)
    {
        int[] arr = intoBinary(n);
        int[] brr = intoBinary(n);

        System.out.println(Arrays.toString(arr));

        d = d % 16;

        // RIGHT ROTATION
        reverseArray(arr , 0 , 15);
        reverseArray(arr , 0 , d-1);
        reverseArray(arr , d , 15);

        int sum_after_right_rotation = decimalValue(arr);

        // LEFT ROTATION
        reverseArray(brr , 0 , 15);
        reverseArray(brr , 0 , 15 - d);
        reverseArray(brr , 15 - d , 15);
        int sum_after_left_rotation = decimalValue(brr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(sum_after_left_rotation);
        list.add(sum_after_right_rotation);

        return list;


    }

    static void reverseArray(int[] arr , int s , int e){
        while(s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;

            s++;
            e--;
        }
    }

    static int decimalValue(int[] arr){
        int decimalValue = 0;
        int p = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            decimalValue += arr[i] * (int) Math.pow(2 , p++);
        }
        System.out.println(decimalValue);
        return decimalValue;
    }
}
