package Strivers_Sheet.ARRAYS;

public class Reverse_Words_in_a_String_151 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\s+");
        String ans = "";
        for(int i = arr.length-1 ; i>=0 ; i--){
            ans += arr[i] + " ";
        }
        ans = ans.trim();
        return ans;
    }
}
