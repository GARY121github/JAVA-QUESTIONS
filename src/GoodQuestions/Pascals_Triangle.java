package GoodQuestions;

import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1 ; row <= n ; row++){
            int value = 1;
            for(int col = 1 ; col <= row ; col++){
                System.out.print(value + " ");
                value = value * (row - col) / col;
            }
            System.out.println();
        }
    }
}
