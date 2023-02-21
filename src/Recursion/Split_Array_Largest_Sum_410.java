package Recursion;

public class Split_Array_Largest_Sum_410 {
    public static void main(String[] args) {

    }

    static int splitArray(int[] arr , int i , int k , int sum){
        if(i == arr.length){
            return sum;
        }

        int min = Integer.MAX_VALUE;
        for(int j = 1 ; j <= k ; j++){
            int temp = splitArray(arr , i+1 , k , sum+arr[i]);
            temp += splitArray(arr , i+1 , k , sum);

            if(temp < min){
                min = temp;
            }
        }

        return min;
    }
}
