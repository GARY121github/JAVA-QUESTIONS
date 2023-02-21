package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Expression_Add_Operators {
    public static void main(String[] args) {
        String num = "232";
        int target = 8;
        List<String> ans = new ArrayList<>();
        operators(num.substring(1) , target , num.charAt(0) - '0' , String.valueOf(num.charAt(0)), ans);
        System.out.println(ans);
    }
    static void operators(String digits , int target , int sum , String ans, List<String> list){
        if(digits.isEmpty()){
            if (target == sum){
                list.add(ans);
            }
            return;
        }

        int n = digits.charAt(0)- '0';
//        MULTIPLICATION
        operators(digits.substring(1) , target , sum*n , ans+'*'+n , list);
//        DIVISION
        operators(digits.substring(1) , target , sum/n , ans+'/'+n , list);
//        ADDITION
        operators(digits.substring(1) , target , sum+n , ans+'+'+n , list);
//        SUBSTRACTION
        operators(digits.substring(1) , target , sum-n , ans+'-'+n , list);
    }
}
