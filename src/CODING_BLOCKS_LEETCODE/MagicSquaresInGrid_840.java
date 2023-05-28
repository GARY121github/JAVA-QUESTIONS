package CODING_BLOCKS_LEETCODE;

public class MagicSquaresInGrid_840 {
    public static void main(String[] args) {
        int[][] grid = {{4,7,8},
                        {9,5,1},
                        {2,3,6}};

        System.out.println(numMagicSquaresInside(grid));
    }
    static int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length - 2 ; i++){
            for(int j = 0 ; j < grid[0].length - 2 ; j++){
                if(areDiagonalsEqual(grid , i , j)){
                    count++;
                }
            }
        }

        return count;
    }

    static boolean areDiagonalsEqual(int[][] arr , int r , int c){

        if(r + 2 >= arr.length && c + 2 >= arr[0].length){
            return false;
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(arr[r+i][c+j] + " ");
            }
            System.out.println();
        }
        int left = 0 , right = 0;
        for(int i = 0 ; i < 3 ; i++){

            left += arr[r+i][c+i];

            right += arr[r+i][c + 2 - i];
        }

        return left == right;
    }
}
