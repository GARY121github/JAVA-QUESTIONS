package CODING_BLOCKS_LEETCODE;

public class Coin_Change_322 {
    public static void main(String[] args) {

    }

    static int CoinChange(int[] coins, int amount , int number_of_coins , String ans) {
        if(amount == 0){
            System.out.println(ans);
            return number_of_coins;
        }

        if(amount < 0){
            return -1;
        }

        for (int i = coins.length-1 ; i >= 0 ; i--){
            int c = CoinChange(coins , amount-coins[i] , number_of_coins+1 , ans+coins[i]);
            if(c != -1){
                return c;
            }
        }

        return -1;
    }
}
