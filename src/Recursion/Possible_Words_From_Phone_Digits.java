package Recursion;

import java.util.ArrayList;

public class Possible_Words_From_Phone_Digits {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(possible_Words(arr , 0 , ""));
    }

    static String[] words = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" ,"wxyz"};
    static ArrayList<String> possible_Words(int[] arr, int index , String ans)
    {
        ArrayList<String> list = new ArrayList<>();
        if(index == arr.length){
            list.add(ans);
            return list;
        }

        for(int i = 0 ; i < words[arr[index]].length() ; i++){
            list.addAll(possible_Words(arr , index+1 , ans + words[arr[index]].charAt(i)));
        }

        return list;
    }
}
