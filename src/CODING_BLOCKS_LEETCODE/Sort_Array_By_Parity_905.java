package CODING_BLOCKS_LEETCODE;

public class Sort_Array_By_Parity_905 {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] arr) {
        int p1 = 0;
        int p2 = 0;
        while(p1 < arr.length && p2 < arr.length){
            if(arr[p1] % 2 != 0){
                if(arr[p2] % 2 == 0){
                    int t = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = t;
                }else{
                    p2++;
                }
            }
            else{
                p1++;
                p2++;
            }
        }
        return arr;
    }
}
