package Recursion;

import java.util.Arrays;

public class Bubble_Sort{
    public static void main(String[] args) {
        int[] a = {4,3,2,1};
        bubble(a , a.length-1 , 0);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[] a,int r, int c) {
        if (r == 0)
            return;

        if (r > c) {
            if(a[c] > a[c+1]) {
                a[c] = a[c] ^ a[c + 1];
                a[c + 1] = a[c] ^ a[c + 1];
                a[c] = a[c] ^ a[c + 1];
            }
            bubble(a, r, ++c);
        } else {
            bubble(a ,--r, 0);
        }
    }
}
