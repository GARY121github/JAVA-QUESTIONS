package CODING_BLOCKS_LEETCODE;

import java.util.*;

public class Transform_the_array_GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 5, 0, 0, 5, 4, 8, 6, 0, 6, 8};
        System.out.println(valid(arr));
    }
    static ArrayList<Integer> valid(int arr[]){
        int s = 0;
        int e = 1;
        while(s < arr.length && e < arr.length){
            if(arr[s+1] == 0){
                if(arr[e] != 0){
                    arr[s] = arr[s] + arr[e];
                    arr[e] = 0;
                    s = e+1;
                    e = s+1;
                }else{
                    e++;
                }
            }
            else if(arr[s] == arr[s+1]){
                arr[s] = 2*arr[s];
                s++;
                e++;
            }
            else{
                s++;
                e++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
            else{
                list.add(arr[i]);
            }
        }
        for(int i = 0 ; i < count ; i++){
            list.add(0);
        }
        return list;
    }
}
