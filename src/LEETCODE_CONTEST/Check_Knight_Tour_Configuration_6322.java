package LEETCODE_CONTEST;

public class Check_Knight_Tour_Configuration_6322 {
    public static void main(String[] args) {
        int[][] arr = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
    }

    static boolean knight(int[][] board , int step , int r , int c){
        if(step == board.length*board[0].length){
            return true;
        }

        if(r >= board.length || r < 0 || c >= board[0].length || c < 0|| board[r][c] != step){
            return false;
        }

        int[] row = {2 , 2 , 1 , -1 , -2 , -2 , 1 , -1};
        int[] col = {1 , -1 , 2 , 2 , 1 , -1 , -2 , -2};

        for(int i = 0 ; i < row.length ; i++){
            boolean f1 = knight(board , step+1 , r+row[i] , c+col[i]);
            if(f1){
                return true;
            }
        }
        return false;
    }
}
