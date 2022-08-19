package Recursion;

import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
//        subset("", "abc");
        System.out.println(subSeq("" , "abc"));
    }

    static void subset(String ans , String given){

        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }

        subset(ans+given.charAt(0) , given.substring(1));
        subset(ans , given.substring(1));

    }

   static ArrayList<String> subSeq(String ans , String given){
       if(given.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(ans);
           return list;
       }

       ArrayList<String> left = subSeq(ans+given.charAt(0) , given.substring(1));
       ArrayList<String> right = subSeq(ans , given.substring(1));

       left.addAll(right);
       return left;
   }

}
