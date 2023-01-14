package Recursion;

public class Target_Sum_494 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1} ;
        int target = 3;
        System.out.println(find_Target_SumWays(arr , target , 0 , 0 , ""));
    }
    static int find_Target_SumWays(int[] arr, int target , int i , int sum , String ans) {
        if(sum == target && i == arr.length){
            System.out.println(ans);
            return 1;
        }
        if(i == arr.length){
            return 0;
        }

        return find_Target_SumWays(arr , target , i+1 , sum+arr[i]  , ans+arr[i]) +
                find_Target_SumWays(arr , target , i+1 , sum-arr[i] , ans+ '-' + arr[i]);
    }
}
