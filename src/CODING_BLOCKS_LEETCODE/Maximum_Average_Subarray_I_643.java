package CODING_BLOCKS_LEETCODE;

public class Maximum_Average_Subarray_I_643 {
    public static void main(String[] args) {
        int[] arr = {5};
        int k = 1;
        System.out.println(findMaxAverage(arr , k));
    }
    static double findMaxAverage(int[] arr, int k) {
        int max_sub_array_till_k = 0;
        int p = 0;
        int s = 0;
        while (p < k){
            max_sub_array_till_k += arr[p];
            p++;
        }
        int current_sub_array_till_k  = max_sub_array_till_k;
        while (p < arr.length){
//            System.out.println(current_sub_array_till_k + "   " + max_sub_array_till_k);
            current_sub_array_till_k -= arr[s];
            current_sub_array_till_k += arr[p];
            if(current_sub_array_till_k > max_sub_array_till_k){
                max_sub_array_till_k = current_sub_array_till_k;
            }
            s++;
            p++;
        }

        return max_sub_array_till_k / (k*1.0);
    }
}
