package Recursion;

// Print the all permutation of the given string.
//Example :->
//Input :
//  abc
//Output :
//  abc , acb , bac , bca , cab , cba

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        printPerm("abc" , "");
        System.out.println(returnPermution("abc", ""));
    }
    static void printPerm(String st, String ans){
        if(st.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = st.charAt(0);
        for(int i=0 ; i <= ans.length(); i++){
            String f = ans.substring(0, i );
            String s = ans.substring(i , ans.length());
            printPerm(st.substring(1) , f + ch + s);
        }
    }

    static ArrayList<String> returnPermution(String st , String ans){
        if(st.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(ans);
            return li;
        }
        char ch = st.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0 ; i <= ans.length() ; i++){
            String f = ans.substring(0, i );
            String s = ans.substring(i , ans.length());
            answer.addAll(returnPermution(st.substring(1) , f + ch + s));
        }
        return answer;
    }

}
