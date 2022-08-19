package Arrays.Sorting.Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5 , 4 ,3 ,2 ,1};
        int b[] = sort(a);
        System.out.println(Arrays.toString(a) + " got sorted into ---> " + Arrays.toString(b));
    }

    static int[] sort(int a[]){
        if(a.length == 1)
            return a;

        int mid = a.length/2;

        int[] left = sort(Arrays.copyOfRange(a ,0 ,mid));
        int[] right = sort(Arrays.copyOfRange(a , mid , a.length));

        return merge(left , right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while ( i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i++];
            }
            else{
                mix[k++] = right[j++];
            }
        }

        while ( i < left.length)
            mix[k++] = left[i++];

        while (j < right.length)
            mix[k++] = right[j++];

        return mix;

    }

}
