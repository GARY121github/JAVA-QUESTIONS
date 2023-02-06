package LEETCODE_CONTEST;

import java.util.Arrays;

public class Count_Vowel_Strings_in_Ranges_6347 {
    public static void main(String[] args) {
        String[] words = {"a","e","i"};
//        [[0,2],[0,1],[2,2]]
        int[][] queries = {{0,2},{0,1},{2,2}};
        System.out.println(Arrays.toString(vowel_Strings(words , queries)));
    }
    static int[] vowel_Strings(String[] words, int[][] queries) {
        int[] vowel = new int[words.length];
        for(int i = 0 ; i < words.length ; i++){
            String st = words[i];
            boolean does = false;
            for (int j = 0 ; j < st.length() ; j++){
                if(st.charAt(j) == 'a' || st.charAt(j) == 'e' || st.charAt(j) == 'i'
                || st.charAt(j) == 'o' || st.charAt(j) == 'u'){
                    does = true;
                    break;
                }
            }

            if( i == 0 && does){
                vowel[i] = 1;
            }
            else if(does){
                vowel[i] = vowel[i-1] + 1;
            }
            else {
                vowel[i] += vowel[i-1];
            }
        }
//        System.out.println(Arrays.toString(vowel));
        int[] ans = new int[queries.length];
        for (int i = 0 ; i < queries.length ; i++){
            int s = queries[i][0];
            int e = queries[i][1];
//            System.out.println(s + " " + e);
            if(s == 0 && vowel[0] != 0 || s == e && vowel[s] != 0){
                ans[i] = vowel[e] - vowel[s] + 1;
            }
            else {
                ans[i] = vowel[e] - vowel[s];
            }
        }

        return ans;
    }

}
