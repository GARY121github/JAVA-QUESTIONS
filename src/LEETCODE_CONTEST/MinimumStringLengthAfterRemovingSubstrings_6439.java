package LEETCODE_CONTEST;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings_6439 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
    }
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            stack.push(ch);
            if(stack.size() >= 2){
                char ch2 = stack.pop();
                char ch1 = stack.pop();
                if((ch1 == 'A' && ch2 == 'B') || (ch1 == 'C' && ch2 == 'D')){

                }
                else{
                    stack.push(ch1);
                    stack.push(ch2);
                }
            }
        }
        return stack.size() - 1;
    }
}
