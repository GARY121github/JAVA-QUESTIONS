package Recursion;

public class Number_of_1_Bits_191 {
    public static void main(String[] args) {
         int n = -3;
    }
    public int hammingWeight(int n) {
        int count = 0;
        if(n == 0){
            return 0;
        }
        if(n % 10 != 0){
            count += 1;
        }
        count += hammingWeight(n/10);

        return count;
    }
}
