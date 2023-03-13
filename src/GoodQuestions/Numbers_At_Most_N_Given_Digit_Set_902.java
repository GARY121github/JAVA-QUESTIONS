package GoodQuestions;

public class Numbers_At_Most_N_Given_Digit_Set_902 {
    public static void main(String[] args) {
        String[] digits = {"1","3","5","7"};
        int n = 100;
        System.out.println(atMostNGivenDigitSet(digits , n));
    }

    static int atMostNGivenDigitSet(String[] digits, int n) {
        numbers(digits , n ,  0);
        return count;
    }

    static int count = -1;
    static void numbers(String[] arr , int n , int ans){
        if(ans > n){
            return;
        }
        count++;
        System.out.println(ans);
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            numbers(arr , n , ans*10 + Integer.parseInt(arr[i]));
        }
//        return count;
    }
}
