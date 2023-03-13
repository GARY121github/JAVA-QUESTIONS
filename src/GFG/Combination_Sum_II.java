package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
//        N = 6, K = 35
//        arr[] = { 5, 10, 15, 20, 25, 30 }
        int k = sc.nextInt();
        System.out.println(CombinationSum2(arr , n , k));
    }

    static List<List<Integer>> CombinationSum2(int a[], int n, int k){
        Arrays.sort(a);
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sum(a , k , ll , list , 0);
        return ll;
    }

    static void sum(int[] arr , int target , List<List<Integer>> ll , List<Integer> list , int index){
        if(target == 0){
            ll.add(new ArrayList<>(list));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index ; i < arr.length ; i++){
            if(i == index || arr[i] != arr[i-1]){
                list.add(arr[i]);
                sum(arr , target-arr[i] , ll , list , i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
