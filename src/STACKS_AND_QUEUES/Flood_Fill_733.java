package STACKS_AND_QUEUES;

import java.util.Arrays;

public class Flood_Fill_733 {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;

        System.out.println(Arrays.toString(floodFill(image , sr , sc , color)));
        for (int[] i : image){
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image , sr , sc , color , image[sr][sc]);
        return image;
    }

    static void fill(int[][] arr , int r , int c , int color , int item){
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] != item){
            return;
        }

        arr[r][c] = -1;
        int[] row = {-1 , 1 , 0 , 0};
        int[] col = {0 , 0 , 1 , -1};

        for(int i = 0 ; i < row.length ; i++)
            fill(arr, r + row[i], c + col[i], color, item);

        arr[r][c] = color;


    }
}
