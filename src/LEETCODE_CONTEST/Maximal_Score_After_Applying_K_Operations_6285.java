package LEETCODE_CONTEST;

import java.util.Arrays;

public class Maximal_Score_After_Applying_K_Operations_6285 {
    public static void main(String[] args) {
        int[] arr = {756902131,995414896,95906472,149914376,387433380,848985151};
        int k = 6;
        System.out.println(maxKelements(arr , k));
    }
    static long maxKelements(int[] arr, int k) {
        long score = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int p = arr.length-1;
        while(k-- > 0){
            score += arr[p];
            arr[p] = (int) Math.ceil(arr[p]/3.0);
            System.out.println(Arrays.toString(arr));
            System.out.println(p);
            if(p == 0){
                continue;
            }
            if(arr[p] < arr[p-1]){
                p--;
            }
        }
        return score;
    }
}
