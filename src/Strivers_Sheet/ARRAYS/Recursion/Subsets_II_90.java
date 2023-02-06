package Strivers_Sheet.ARRAYS.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets_II_90 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(no_duplicate_sub_set(arr , 0 , new ArrayList<>()));
    }
    static List<List<Integer>> no_duplicate_sub_set(int[] arr , int index , List<Integer> ans){
        List<List<Integer>> list = new ArrayList<>();
        if(index == arr.length){
            list.add(new ArrayList<>(ans));
            return list;
        }

        for (int i = index ; i < arr.length ; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                list.addAll(no_duplicate_sub_set(arr , i+1 , ans));
                ans.add(arr[i]);
                list.addAll(no_duplicate_sub_set(arr , i+1 , ans));
                ans.remove(ans.size()-1);
            }
        }

        return list;
    }
}
