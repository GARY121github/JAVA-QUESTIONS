package Strivers_Sheet.ARRAYS;

//  https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.util.Arrays;
import java.util.Scanner;

/*
2
2 3
7 19 3
4 21 0
3 3
1 2 3
4 0 6
7 8 9

*/
public class Set_Matrix_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i = 0 ; i < n ; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }
    }

    static void zeroPositions(int[][] arr){
        int[][] zeros = new int[1][arr.length];
        for(int i = 0 ; i < zeros.length ; i++){
            for(int j = 0 ; j < zeros[i].length ; j++){
                arr[i][j] = -1;
            }
        }
        int a = 0 , b = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == 0){
//                    zeros[a][b++] =
                }
            }
        }
    }
}
