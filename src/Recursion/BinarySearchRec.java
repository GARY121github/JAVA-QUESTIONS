package Recursion;

import java.util.Scanner;

public class BinarySearchRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binSearch(a,target,0,a.length-1));
    }

    private static boolean binSearch(int[] a, int target, int s, int e) {
        if (s <= e) {
            int mid = s+(e-s)/2;
            if(a[mid] == target)
                return true;
            if(a[mid] > target){
                return binSearch(a,target,s,mid-1);
            }
            if(a[mid] < target){
                return binSearch(a,target,mid+1,e);
            }
        }
            return false;
    }
}

