package GoodQuestions;

import java.util.Arrays;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] arr) {
        boolean one = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                one = true;
            }
            if(arr[i] <= 0 || arr[i] > arr.length){
                arr[i] = 1;
            }
        }

        if(!one){
            return 1;
        }

        for(int i = 0 ; i < arr.length ; i++){
            int pos = Math.abs(arr[i]) - 1;

            if(arr[pos] > 0){
                arr[pos] *= -1;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                return i+1;
            }
        }
        return arr.length+1;
    }
}
