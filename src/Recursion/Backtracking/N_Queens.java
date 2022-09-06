package Recursion.Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(placeQueens(board , 0) + " Ways!!!");
    }

    static int placeQueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0 ; col < board.length ; col++){
            if(isValid(board, row , col)){
                board[row][col] = true;
                count += placeQueens(board , row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {

        // VERTICALLY
        for(int i = 0 ; i <= row ; i++){
            if(board[i][col])
                return false;
        }
        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }
        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for (boolean col : row){
                if(col == true)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
