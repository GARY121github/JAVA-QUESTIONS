package Arrays.Sorting.Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1])
                {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }
}
