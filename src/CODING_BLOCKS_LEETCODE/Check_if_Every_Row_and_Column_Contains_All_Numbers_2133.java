package CODING_BLOCKS_LEETCODE;

public class Check_if_Every_Row_and_Column_Contains_All_Numbers_2133 {
    public static void main(String[] args) {

    }

    public boolean checkValid(int[][] mat) {
        int n= mat.length;

        //mark position by making negative from positive ROW-WISE
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int pos= Math.abs(mat[i][j]) -1 ;  // Getting position by value

                if( mat[i][pos] < 0 ) return false;    //If place already marked
                mat[i][pos] = -mat[i][pos];    //Mark Place
            }
        }

        //mark position by making negative to positive COLUMN-WISE
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int pos= Math.abs(mat[j][i]) -1 ;   // Getting position by value

                if( mat[pos][i] > 0 ) return false;    //If place already marked
                mat[pos][i]= Math.abs(mat[pos][i]);        //Mark Place
            }
        }

        return true;
    }
}
