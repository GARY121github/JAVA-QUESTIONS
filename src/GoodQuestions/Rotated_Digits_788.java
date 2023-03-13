package GoodQuestions;

import java.util.Scanner;

public class Rotated_Digits_788 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(isValid(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isValid(int n){
        boolean rotate = false;
        while (n > 0){
            int t = n%10;

            switch (t){
                case 0:
                case 1:
                case 8:
                    break;

                case 2:
                case 5:
                case 6:
                case 9:
                    rotate = true;
                    break;

                default: return false;
            }
            n /= 10;
        }
        return rotate;
    }
}
