package Recursion;

/*
    First uppercase letter in a string (Iterative and Recursive) 
    eg:
    Input: harSh
    Output: S
*/

import java.util.*;
public class FirstUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT THE STRING");
        String st = sc.nextLine();
        System.out.println(findUpperRec(st , 0));
    }

    private static char findUpperRec(String st, int index) {
        if(index == st.length())
            return '1';
        if(Character.isUpperCase(st.charAt(index)))
            return st.charAt(index);

        return findUpperRec(st , ++index);

    }
}
