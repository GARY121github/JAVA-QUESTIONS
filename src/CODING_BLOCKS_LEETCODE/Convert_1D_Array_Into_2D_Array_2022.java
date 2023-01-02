package CODING_BLOCKS_LEETCODE;

public class Convert_1D_Array_Into_2D_Array_2022 {
    public static void main(String[] args) {

    }
    static int[][] construct2DArray(int[] original, int m, int n) {
        if(n*m != original.length){
            return new int[][]{};
        }

        int p = 0;

        int[][] arr = new int[m][n];
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = original[p++];
            }
        }

        return arr;
    }
}
