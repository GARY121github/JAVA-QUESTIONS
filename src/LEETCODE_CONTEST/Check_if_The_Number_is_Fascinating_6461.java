package LEETCODE_CONTEST;

public class Check_if_The_Number_is_Fascinating_6461 {
/*
Input: n = 192
Output: true
Explanation: We concatenate the numbers n = 192 and 2 * n = 384 and 3 * n = 576. The resulting number is 192384576.
This number contains all the digits from 1 to 9 exactly once.

*/
public boolean isFascinating(int n) {
    String number = "" + n;
    number += n*2;
    number += n*3;

    int[] arr = new int[10];
    for(int i = 0 ; i < number.length() ; i++){
        arr[number.charAt(i) - '1']++;
    }

    for(int i : arr){
        if(i != 1){
            return false;
        }
    }

    return true;

}
}
