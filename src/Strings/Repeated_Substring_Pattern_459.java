package Strings;

public class Repeated_Substring_Pattern_459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
    static boolean repeatedSubstringPattern(String st) {
       int s = 0;
       int e = 1;
       String word = "";
       int len = 0;
       while (e < st.length()){
           if(st.charAt(s) == st.charAt(e)){
               word = st.substring(s , e);
               len = word.length();
               break;
           }
           e++;
       }
//        System.out.println(word);
//        System.out.println(st.substring(s));
       for(int i = e ; i < st.length() ; i += len){
//           System.out.println(st.substring(i , i+len));
           if(i+len > st.length() || !word.equals(st.substring(i , i+len))){
               return false;
           }
       }
       return true;
    }
}
