package CODING_BLOCKS_LEETCODE;

public class Sort_Array_By_Parity_II_922 {
    public int[] sortArrayByParityII(int[] arr) {
        int p1 = 0;
        int p2 = 0;
        while(p1 < arr.length && p2 < arr.length){
            if(p1%2 == arr[p1]%2){
                p1++;
                p2++;
            }
            else{
                if(arr[p2]%2 == p1%2){
                    int t = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = t;
                    p1++;
                    p2=p1;
                }
                else{
                    p2++;
                }
            }
        }
        return arr;
    }
}
