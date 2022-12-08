package GoodQuestions;

/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated
to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer
range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and
if the quotient is strictly less than -231, then return -231.



Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.


Constraints:

-2^31 <= dividend, divisor <= 2^31 - 1
divisor != 0
*/

public class Divide_Two_Integers {
    public static void main(String[] args) {
        int dividend = -1;
        int divisor = -1;
        System.out.println(divide_two(dividend , divisor));;
    }

    static int divide_two(int dividend, int divisor) {
//        FOR POSITIVE NUMBERS
        if(dividend > 0 && divisor > 0)
        return positive(dividend , divisor);

//        WHEN ONE OF THEM IS NEGATIVE NUMBERS
        else if(dividend < 0 || divisor < 0)
            return one_is_negative(dividend , divisor);

//        WHEN BOTH ARE NEGATIVE
        else
            return both_are_negative(dividend , divisor);
    }

    static int positive(int dividend, int divisor){
        int product_by_sum = 0;
        int count = 0;
        while (true){
            product_by_sum += divisor;
            if(product_by_sum > dividend){
                break;
            }
            count++;
        }

        return  count;
    }

    static int one_is_negative(int dividend, int divisor){
        int product_by_sum = 0;
        int count = 0;
        if(dividend < 0){
            dividend = dividend * -1;
        }
        else {
            divisor = divisor * -1;
        }
        while (true){
            product_by_sum += divisor;
            if(product_by_sum > dividend){
                break;
            }
            count++;
        }

        return  count*-1;
    }
    static int both_are_negative(int dividend, int divisor){
        int product_by_sum = 0;
        int count = 0;
       dividend *= -1;
       divisor *= -1;

        while (true){
            product_by_sum += divisor;
            if(product_by_sum > dividend){
                break;
            }
            count++;
        }

        return  count;
    }
}
