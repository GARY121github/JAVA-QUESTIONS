package CODING_BLOCKS_LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3_15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }

    static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        sum(arr , 0 , 0 , 0 , list , ll);
        return ll;
    }

    static void sum(int[] arr , int sum ,int elements , int index, List<Integer> list , List<List<Integer>> ll){

        if(elements == 3){
            if(sum == 0){
                ll.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = index ; i < arr.length ; i++){
            if(i == index || arr[i] != arr[i-1]){
                list.add(arr[i]);

                sum(arr , sum+arr[i] , elements+1 , i+1 , list , ll);

                list.remove(list.size() - 1);
            }
        }
    }
}
