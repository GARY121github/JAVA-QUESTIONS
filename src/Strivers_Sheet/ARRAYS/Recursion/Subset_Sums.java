package Strivers_Sheet.ARRAYS.Recursion;

import java.util.ArrayList;

public class Subset_Sums {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        ArrayList<Integer> ans = new ArrayList<>();
        subSetSums(list , ans , 0);
        System.out.println(ans);
    }

    static void subSetSums(ArrayList<Integer> arr , ArrayList<Integer> ans , int sum){
        if(arr.isEmpty()){
            ans.add(sum);
            return;
        }

        int a = arr.get(0);
        arr.remove(0);
        subSetSums(arr , ans , sum);
        subSetSums(arr , ans , sum+a);
        arr.add(a);
    }
}
