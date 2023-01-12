package Recursion;

public class Count_Operations_to_Obtain_Zero_2169 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(countOperations(num1 , num2 , 0));

    }
    static int countOperations(int num1, int num2 , int count) {
        if(num1 == 0 || num2 == 0){
            return count;
        }

        if(num1 >= num2){
            num1 = num1-num2;
            return countOperations(num1 , num2 , count+1);
        }
        else{
            num2 = num2 - num1;
            return countOperations(num1 , num2 , count+1);
        }

    }
}
