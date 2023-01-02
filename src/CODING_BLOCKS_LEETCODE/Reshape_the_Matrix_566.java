package CODING_BLOCKS_LEETCODE;

public class Reshape_the_Matrix_566 {
    public static void main(String[] args) {
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                arr[row][col] = mat[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return arr;
    }

    public int[][] Reshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (r * c != m * n)
            return nums;
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++)
            reshaped[i/c][i%c] = nums[i/n][i%n];
        return reshaped;
    }

    static void print(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
