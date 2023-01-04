package CODING_BLOCKS_LEETCODE;

import java.util.*;

public class Fair_Candy_Swap_888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

//    public int[] fairCandySwap(int[] A, int[] B) {
//        int sumA = 0, sumB = 0;
//        for (int i = 0; i < A.length; i++)
//            sumA += A[i];
//        for (int i = 0; i < B.length; i++)
//            sumB += B[i];
//        int dif = (sumA - sumB) / 2;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < B.length; j++) {
//                if (A[i] - B[j] == dif)
//                    return new int[]{A[i], B[j]};
//            }
//        }
//        return null;
//    }

    private int binarySearch(int[] arr,int target){
        int s=0,e = arr.length-1;

        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;

        }
        return -1;
    }

    public int[] fairCandySwap(int[] a, int[] b) { //a = Alice , b=Bob
        int suma=0,sumb=0;
        for(int i=0;i<a.length;i++)
            suma+=a[i];
        for(int i=0;i<b.length;i++)
            sumb+=b[i];

        int diff = (suma-sumb)/2;

        Arrays.sort(a);
        for(int num:b){
            if (binarySearch(a,num+diff) !=-1) return new int[]{num+diff,num};
        }

        return null;

    }
}
