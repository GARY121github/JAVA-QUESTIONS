import java.util.Arrays;

public class Doubts {
    public static void main(String[] args) {
        String s1 = "111";
        String s2 = "11";
        System.out.println(addBinary(s1 , s2));
    }
    public static String addBinary(String a, String b) {
        int p1 = a.length()-1;
        int p2 = b.length()-1;
        String ans = "";
        int carry = 0;
        while (p1 >= 0 && p2 >= 0){
            char ch1 = a.charAt(p1);
            char ch2 = b.charAt(p2);

            int t = ((int) ch1 - '0') + ((int) ch2 - '0') + carry;

            int p = t%2;
            carry = t/2;

            ans = p + ans;

            p1--;
            p2--;
        }

        if(p1 == -1){
            while (p2 >= 0){
                char ch2 = b.charAt(p2);

                int t = ((int) ch2 - '0') + carry;

                int p = t%2;
                carry = t/2;

                ans = p + ans;
                p2--;
            }
        }
        else{
            while (p1 >= 0){
                char ch1 = a.charAt(p1);
                int t = ((int) ch1 - '0') + carry;

                int p = t%2;
                carry = t/2;

                ans = p + ans;

                p1--;
            }
        }
        if(carry != 0){
            ans = carry + ans;
        }

        return ans;
    }
}
