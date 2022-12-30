package CODING_BLOCKS_LEETCODE;

public class Find_the_Duplicate_Number_287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int pos = Math.abs(arr[i]) - 1;

            if(arr[pos] < 0){
                return Math.abs(arr[i]);
            }
            arr[pos] = arr[pos]*-1;
        }
        return -1;
    }

}
