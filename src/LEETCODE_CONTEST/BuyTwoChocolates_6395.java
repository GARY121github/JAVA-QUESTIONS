package LEETCODE_CONTEST;

import java.util.Arrays;

public class BuyTwoChocolates_6395 {
    public static void main(String[] args) {

    }

    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int ans = money - (arr[0]+arr[1]);
        if(ans < 0){
            return money;
        }

        return ans;
    }
}
