package Strings;

public class Add_Binary {
    public static void main(String[] args) {
        String s1 = "11111";
        String s2 = "111";
        System.out.println(addBinary(s1 , s2));
    }


    /*
       111110
      -------
        11111
      +   111
      -------
       100110
    */


    static String addBinary(String s1 , String s2){
        String ans = "";
        int p1 = s1.length()-1;
        int p2 = s2.length()-1;
        int carry = 0;
        while(p1 >= 0 && p2 >= 0){
            int i1 = s1.charAt(p1) - 48;
            int i2 = s2.charAt(p2) - 48;

            int add = i1 + i2 + carry;
            carry = add / 2;

            int digit = add % 2;

            ans = digit + ans;

            p1--;
            p2--;
        }

        if(p1 != -1){
            while(p1 >= 0){
                int i1 = s1.charAt(p1) - 48;

                int add = i1 + carry;
                carry = add / 2;

                int digit = add % 2;

                ans = digit + ans;
                p1--;
            }
        } else if (p2 != -1) {
            while (p2 >= 0){
                int i2 = s2.charAt(p2) - 48;

                int add = i2 + carry;
                carry = add / 2;

                int digit = add % 2;

                ans = digit + ans;

                p2--;
            }
        }

        if(carry != 0){
            ans = '1' + ans;
        }

        return ans;
    }
}
