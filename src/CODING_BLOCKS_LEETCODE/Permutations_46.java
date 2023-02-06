package CODING_BLOCKS_LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Permute(arr , new ArrayList<>()));
    }
    static List<List<Integer>> Permute(int[] arr , List<Integer> list) {
        List<List<Integer>> ans = new ArrayList<>();
        if(list.size() == arr.length){
            ans.add(new ArrayList<>(list));
            return ans;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 100){
                list.add(arr[i]);
                int a = arr[i];
                arr[i] = 100;
                ans.addAll(Permute(arr , list));
                arr[i] = a;
                list.remove(list.size()-1);
            }
        }

        return ans;
    }
}
