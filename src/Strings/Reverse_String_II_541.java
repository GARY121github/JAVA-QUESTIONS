package Strings;

public class Reverse_String_II_541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s , k));
    }
    static String reverseStr(String st, int k) {
        StringBuilder ans = new StringBuilder();
        int s = 0 ;
        int e = k-1;
        while (e < st.length()){
            for(int i = e ; i >= s ; i--){
                ans.append(st.charAt(i));
            }
            s = e+1;
            e = e+k;
        }

        return ans.toString();
    }
}
