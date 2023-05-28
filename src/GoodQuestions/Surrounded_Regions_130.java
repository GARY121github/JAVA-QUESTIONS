package GoodQuestions;

public class Surrounded_Regions_130 {
    public static void main(String[] args) {
        char[][] arr = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        Solution solution = new Solution();
        solution.solve(arr);

    }
}
class Solution {
    public void solve(char[][] board) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 'O')
                {
                    boolean ans = isValid(i , j , board);
                    if(ans){
                        board[i][j] = 'X';
                    }
                    display(board);
                }
            }
        }
    }

    static void display(char[][] arr){
        for(char[] i : arr){
            for(char j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isValid(int r , int c , char[][] board){
        // UPSIDE
        boolean isPresent = false;
        for(int i = r-1 ; i >= 0 ; i--){
            if(board[i][c] == 'X'){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            return false;
        }
        // DOWNSIDE
        isPresent = false;
        for(int i = r+1 ; i < board.length ; i++){
            if(board[i][c] == 'X'){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            return false;
        }

        // LEFTSIDE
        isPresent = false;
        for(int i = c-1 ; i >= 0 ; i--){
            if(board[r][i] == 'X'){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            return false;
        }

        // RIGHTSIDE
        isPresent = false;
        for(int i = c+1 ; i < board[0].length ; i++){
            if(board[r][i] == 'X'){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            return false;
        }

        return true;

    }
}
