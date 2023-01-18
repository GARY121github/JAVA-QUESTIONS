package CODING_BLOCKS_LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;

public class Diagonal_Traverse_498 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }
    static int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int no_of_diagonals = row + col - 1;
        int[] ans = new int[row*col];
        int p = 0;
        for(int i = 0 ; i < no_of_diagonals ; i++){
            int r = 0;
            int c = 0;
            if(i < col){
                r = 0;
                c = i;
            }
            else{
                r = i - col + 1;
                c = col - 1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while (r < row && c >= 0){
                list.add(mat[r][c]);
                r++;
                c--;
            }

            if(i%2 == 0){
                for(int k = 0 ; k < list.size() ; k++){
                    ans[p++] = list.get(k);
                }
            }
            else{
                for(int k = list.size()-1 ; k >= 0 ; k--){
                    ans[p++] = list.get(k);
                }
            }
        }
        return ans;
    }
}
