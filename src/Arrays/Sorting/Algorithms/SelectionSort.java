package Arrays.Sorting.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }
}
