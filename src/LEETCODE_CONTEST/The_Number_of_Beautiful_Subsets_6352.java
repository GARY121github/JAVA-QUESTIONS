package LEETCODE_CONTEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class The_Number_of_Beautiful_Subsets_6352 {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int k = 2;
        System.out.println(beautifulSubSets(arr , k , 0 , new ArrayList<>()));
    }

    static int beautifulSubSets(int[] arr , int k , int index , ArrayList<Integer> list){
//        BASE CONDITION

        if(index == arr.length){
            if(list.size() > 0){
                return 1;
            }

            return 0;
        }

        int count = 0;

        if(!list.contains(arr[index] - k)){

            list.add(arr[index]);

            count += beautifulSubSets(arr , k , index+1 , list);

            list.remove(list.size()-1);
        }


        count += beautifulSubSets(arr , k , index+1 , list);

        return count;

    }

}
