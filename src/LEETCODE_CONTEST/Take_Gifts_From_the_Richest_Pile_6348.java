package LEETCODE_CONTEST;

import java.util.Arrays;

public class Take_Gifts_From_the_Richest_Pile_6348 {
    public static void main(String[] args) {

    }
    static long pick_Gifts(int[] gifts, int k) {
        while (k-- > 0){
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int) Math.sqrt(gifts[gifts.length-1]);
        }

        long ans = 0;
        for (int i : gifts){
            ans += i;
        }

        return ans;
    }
}
