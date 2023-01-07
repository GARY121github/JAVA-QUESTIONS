package Strings;

import java.util.Scanner;

/*
You are given the string S . Compress the string when lower and upper cases are the same.
In compressed string characters should be in lowercase.

Example 1:
Input: S = "aaABBb"
Output: "3a3b"
Explanation: As 'a' appears 3 times
consecutively and 'b' also 3 times,
and 'b' and 'B' considered as same.

Example 2:
Input: S = "aaacca"
Output: "3a2c1a"
Explanation: As 'a' appears 3 times
consecutively and 'c' also 2 times,
and then 'a' 1 time.
Your Task:
You don't need to read input or print anything. Your task is to complete the function transform() which takes the string S as
inputs and returns the compressed string.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 2 * 105

S contains only lowercase and uppercase characters.
*/
public class Easy_string_GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(transform(st));
    }

    static String transform(String st){
        int s = 0;
        int e = 0;
        StringBuilder ans = new StringBuilder();
        int count = 0;
        while (e < st.length()){
            if(st.charAt(s) == st.charAt(e) || st.charAt(s) == (char) (st.charAt(e)+32) || st.charAt(s) == (char) (st.charAt(e)-32)){
                e++;
                count++;
            }
            else{
                ans.append(Integer.toString(count));
                char ch = st.charAt(s);
                if(ch >= 65 && ch <= 90)
                    ans.append((char) (st.charAt(s) + 32));
                else
                    ans.append(st.charAt(s));
                count = 0;
                s = e;
            }
        }
        if(count > 0){
            ans.append(Integer.toString(count));
            char ch = st.charAt(s);
            if(ch >= 65 && ch <= 90)
                ans.append((char) (st.charAt(s) + 32));
            else
                ans.append(st.charAt(s));
        }
        return ans.toString();
    }
}
