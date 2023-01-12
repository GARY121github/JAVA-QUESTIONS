package Recursion;

/*
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.


Your Task:
You dont need to read input or print anything. Complete the function removeConsecutiveCharacter() which accepts a
string as input parameter and returns modified string.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).


Constraints:
1<=|S|<=10^5
All characters are lowercase alphabets.
*/
public class Remove_Consecutive_Characters {
    public static void main(String[] args) {
        String st = "aabaa";
        System.out.println(removeConsecutiveCharacter(st , ""));
    }

    static String removeConsecutiveCharacter(String s , String ans) {
        if(s.length() == 0){
            return ans;
        }
        if(ans.length() > 0 && s.charAt(0) == ans.charAt(ans.length()-1)){
                return removeConsecutiveCharacter(s.substring(1) , ans);
        }
        return removeConsecutiveCharacter(s.substring(1) , ans + s.charAt(0));
    }
}
