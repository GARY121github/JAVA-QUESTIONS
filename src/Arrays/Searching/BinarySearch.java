package Arrays.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Input the element to be searched");
        int target = sc.nextInt();

        System.out.println(binSearch(a,target)+1);
    }

    static int binSearch(int[] a , int target){
        int s = 0;
        int e = a.length-1;
        while (s<=e){
            int mid = (s+e)/2;
            if(a[mid] == target)
                return mid;
            else if (a[mid] > target)
                e = mid-1;
            else
                s = mid+1;
        }
        return -1;

    }
}
