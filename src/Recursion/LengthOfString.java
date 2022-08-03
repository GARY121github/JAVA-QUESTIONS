package Recursion;
//        WAP to print the length of the string.

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        String st = "harsh";
        System.out.println(len(st));
    }
    static int len(String st){
        if(st.length()==0){
            return 0;
        }

        return 1+len(st.substring(0,st.length()-1));
    }
}
