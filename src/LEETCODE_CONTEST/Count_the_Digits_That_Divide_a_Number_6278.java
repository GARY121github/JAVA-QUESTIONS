package LEETCODE_CONTEST;

public class Count_the_Digits_That_Divide_a_Number_6278 {
    public static void main(String[] args) {

    }
    static int countDigits(int num) {
        int n = num;
        int[] num_array = new int[9];
        int count = 0;
        while (n > 0){
            int k = n%10;
            if(num_array[k] == 0){
                if(num % k == 0){
                    count++;
                }
                num_array[k]++;
            }
            n = n/10;
        }
        return count;
    }
}
