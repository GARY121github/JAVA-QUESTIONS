package GFG;

public class Largest_subarray_with_0_sum {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , -4 , -2 , 2 , 1 , -1};
        System.out.println(maxLen(arr , arr.length));
    }
    static int maxLen(int arr[], int n)
    {
        int sum = 0 ;
        int s = 0;
        int e = 0;
        int ans = 0;
        while(e < n){
            sum += arr[e];

            if(sum > 0){
                sum = 0;
                s = e+1;
            }
            else{
                int current = e-s+1;
                if(sum == 0 && current > ans){
                    for(int i = s ; i <= e ; i++){
                        System.out.print(arr[i] + " ");
                    }
                    ans = current;
                    System.out.println();
                }

            }
            e++;
        }

        return ans;
    }
}
