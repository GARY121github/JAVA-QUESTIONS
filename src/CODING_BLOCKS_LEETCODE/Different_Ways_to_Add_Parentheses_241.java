package CODING_BLOCKS_LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses_241 {
    public static void main(String[] args) {
        String st = "2*3-4*5";
        Different_Ways_to_Add_Parentheses_241 ob = new Different_Ways_to_Add_Parentheses_241();
        System.out.println(ob.diffWaysToCompute(st));
    }
    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < expression.length() ; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0 , i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for(int lef : left){
                    for (int rig : right){
                        if(ch == '+')
                            ans.add(lef+rig);
                        if(ch == '-')
                            ans.add(lef-rig);
                        if(ch == '*')
                            ans.add(lef*rig);
                    }
                }
            }
        }

        if(ans.size() == 0){
            ans.add(Integer.parseInt(expression));
        }

        return ans;
    }
}
