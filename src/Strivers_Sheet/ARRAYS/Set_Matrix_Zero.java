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
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            display(arr);

            System.out.println();

            setMatrixZero(arr);

            display(arr);


        }
    }


    static void setMatrixZero(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == 0){
                    set_1(arr , i , j);
                }
            }
        }
        setZero(arr);
    }

    static void set_1(int[][] arr , int r , int c){

//        SET LEFT SIDE TO -1
        for(int i = r ; i >= 0 ; i--){
            if(arr[i][c] == 0){
                continue;
            }
            else {
                arr[i][c] = -1;
            }
        }

//        SET RIGHT SIDE TO -1
        for(int i = r ; i < arr.length ; i++){
            if(arr[i][c] == 0){
                continue;
            }
            else {
                arr[i][c] = -1;
            }
        }

//        SET TOP SIDE TO -1
        for (int j = c ; j >= 0 ; j--){
            if(arr[r][j] == 0){
                continue;
            }
            else {
                arr[r][j] = -1;
            }
        }


//        SET BOTTOM SIDE TO -1
        for (int j = c ; j < arr[0].length ; j++){
            if(arr[r][j] == 0){
                continue;
            }
            else {
                arr[r][j] = -1;
            }
        }
    }


    static void setZero(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void display(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
