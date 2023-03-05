package CODING_BLOCKS_LEETCODE;

public class Count_Numbers_with_Unique_Digits_357 {
    public static void main(String[] args) {

    }

    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;

        int ans = 1 + 9;
        int start = 9;
        int current = 9;
        while(n-- > 1){
            current *= start--;
            ans += current;
        }

        return ans;
    }
}
