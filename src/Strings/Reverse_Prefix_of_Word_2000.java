package Strings;

import java.util.Arrays;

public class Reverse_Prefix_of_Word_2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word , ch));
    }
    static String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == ch){
                reverse(arr , i);
                break;
            }
        }
        return Arrays.toString(arr);
    }

    static void reverse(char[] arr , int e){
        int s = 0;
        while (s < e){
            char ch = arr[s];
            arr[s] = arr[e];
            arr[e] = ch;

            s++;
            e--;
        }
    }
}
