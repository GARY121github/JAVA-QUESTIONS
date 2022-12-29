package CODING_BLOCKS_LEETCODE;

public class Search_a_2D_Matrix_74 {
    public static void main(String[] args) {
    }

    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m; i++){
            if(matrix[i][n-1] >= target){
                return binarySearch(matrix[i] , target);
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr , int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return false;
    }
}
