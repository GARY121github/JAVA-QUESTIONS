package GoodQuestions;

import java.util.*;
public class Maximum_Ice_Cream_Bars_1833 {
    public static void main(String[] args) {

    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int i = 0 ; i < costs.length ; i++){
            if(coins >= costs[i]){
                count++;
                coins -= costs[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}

