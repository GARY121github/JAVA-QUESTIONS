package CODEFORCES;

import java.util.Scanner;

public class Insert_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int digit = sc.nextInt();
            String st = sc.next();
            String ans = "";
            int pos = -1;
            for(int i = st.length()-1 ; i >= 0 ; i--){
                int current = st.charAt(i) - 47;
                if(current <= digit){
                    pos = i;
                }
            }
            if(pos == -1){
                System.out.println(st + digit);
            }
            else{
                ans = st.substring(0, pos) + digit +st.substring(pos);
                System.out.println(ans);
            }
        }
    }
}
