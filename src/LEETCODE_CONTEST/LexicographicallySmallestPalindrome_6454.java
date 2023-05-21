package LEETCODE_CONTEST;

public class LexicographicallySmallestPalindrome_6454 {
    public static void main(String[] args) {
        String s = "seven";
    }
    public String makeSmallestPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        String ans = "";
        while (p1 < p2){
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);

            if(ch1 == ch2){
                ans = ans.substring(0 ,ans.length()/2) + ch1 + ch2 + ans.substring(ans.length() / 2);
            }
            else{
                String s1 = ans.substring(0 , ans.length()/2) + ch1 + ch1 + ans.substring(ans.length() / 2);
                String s2 = ans.substring(0 ,ans.length()/2) + ch2 + ch2 + ans.substring(ans.length() / 2);

                if(s1.compareTo(s2) >= 0){
                    ans = s2;
                }
                else{
                    ans = s1;
                }
            }
        }
        if(p1 == p2){
            ans = ans.substring(0,ans.length()/2) + s.substring(p1) + ans.substring(ans.length() / 2);
        }
        return ans;
    }
}
