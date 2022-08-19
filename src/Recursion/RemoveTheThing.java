package Recursion;


public class RemoveTheThing {
    public static void main(String[] args) {
        String st = "aaaaabcbbbbb";
//        System.out.println(removeChar(st , 'a'));
//        System.out.println(removeString(st , "ab"));
//        System.out.println(removeAdjacentDuplicate(st , ""));
    }


//    Remove any character from the given string.
    static String removeChar(String st , char ch){
        if(st.isEmpty())
            return "";

        if(st.charAt(0) == ch)
            return removeChar(st.substring(1) , ch);
        else
            return st.charAt(0) + removeChar(st.substring(1), ch);
    }



//    Remove the string from the given string.
    static String removeString(String st , String remove){
        if(st.isEmpty())
            return "";

        if(st.startsWith(remove))
            return removeString(st.substring( remove.length()) , remove);
        else
            return st.charAt(0) + removeString(st.substring(1), remove);
    }



//    Given a string S, remove all the consecutive duplicates.
//    Note that this problem is different from Recursively remove all adjacent duplicates.
//    Here we keep one character and remove all subsequent same characters.
//
//    Examples:
//    Input  : aaaaabbbbbb
//    Output : ab
//
//    Input : geeksforgeeks
//    Output : geksforgeks
//
//    Input : aabccba
//    Output : abcba

    static String removeAdjacentDuplicate(String st, String ans){
        if(st.isEmpty())
            return ans;

        if(ans.length() > 0 && ans.charAt(ans.length()-1) == st.charAt(0))
            return removeAdjacentDuplicate(st.substring(1) , ans);
        else
            return removeAdjacentDuplicate(st.substring(1),  ans+st.charAt(0));


    }
}
