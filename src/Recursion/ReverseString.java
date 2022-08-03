package Recursion;

import java.util.Scanner;

//    reverse a string by Recursion
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT THE STRING");
        String st = sc.nextLine();

        System.out.println(revStr(st));
        System.out.println(revByWord(st));
    }

    // Reverse whole string
    static String revStr(String st){
        if(st.length() == 0 ){
            return "";
        }
        return st.charAt(st.length()-1)+revStr(st.substring(0,st.length()-1));
    }

//    Revese String word by word

    static String revByWord(String st){
        int i = 0;
        StringBuilder builder = new StringBuilder();
        for(; i<st.length() ; i++){
            if(st.charAt(i) == ' '){
                builder.append(revStr(st.substring(builder.length(),i)));
                builder.append(" ");
            }
        }
        builder.append(revStr(st.substring(builder.length(),i)));
        return builder.toString();
    }
}
