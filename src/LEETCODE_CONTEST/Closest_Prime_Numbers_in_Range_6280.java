package LEETCODE_CONTEST;

import java.util.Arrays;

public class Closest_Prime_Numbers_in_Range_6280 {
    public static void main(String[] args) {
        int l = 10;
        int r = 19;
        System.out.println(Arrays.toString(closestPrimes(l , r)));
    }
    static int[] closestPrimes(int left, int right){
        int s = left+1;
        int e = right-1;
        int[] ans = {-1 , -1};
        while (s < e){
            if(isPrime(s)){
                if(ans[0] == -1){
                    ans[0] = s;
                }
            }
            if(ans[0] == -1){
                s++;
            }

            if(isPrime(e)){
                    ans[1] = e;
            }
                e--;

        }

        return ans;
    }

    static boolean isPrime(int n){
        for(int i = 2 ; i <= (int) Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
