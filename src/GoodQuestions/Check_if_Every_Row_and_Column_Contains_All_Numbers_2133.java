package GoodQuestions;

public class Check_if_Every_Row_and_Column_Contains_All_Numbers_2133 {
    public static void main(String[] args) {

    }

    static boolean checkValid(int[][] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int[] temp = new int[arr.length];
            for(int j = 0 ; j < arr.length ; j++){
                temp[arr[i][j]-1]++;
            }
            if(doesItContains(temp) == false){return false;}
        }
        return true;
    }

    static boolean doesItContains(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
