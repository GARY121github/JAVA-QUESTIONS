package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(All_Parenthesis(n , 0 , 0 , ""));
    }

    static List<String> All_Parenthesis(int n , int open , int close , String ans){
        List<String> list = new ArrayList<>();
        if(open == n && close == n){
            list.add(ans);
            return list;
        }

        if(open < n){
            list.addAll(All_Parenthesis(n , open+1 , close , ans + '('));
        }

        if(close < open && close < n){
            list.addAll(All_Parenthesis(n , open , close+1 , ans + ')'));
        }

        return list;
    }
}
