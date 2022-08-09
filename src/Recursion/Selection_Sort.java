package Recursion;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int a[] = {4,3,2,1};
        selSort(a,a.length-1 , 0);
        System.out.println(Arrays.toString(a));
    }

    static void selSort(int[] a , int r , int c) {
        if(r == 0)
            return;

        if(r > c){
            if(a[r] < a[c]){
                a[r] = a[r]^a[c];
                a[c] = a[r]^a[c];
                a[r] = a[r]^a[c];
            }
            selSort(a, r , ++c);
        }
        else {
            selSort(a , --r , 0);
        }

    }

}
