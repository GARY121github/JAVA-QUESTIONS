package CODEFORCES;

import java.util.Scanner;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                int temp = a;
                a = b;
                b = temp;
            }
            solution(a , b);
        }
    }

    static void solution(int a , int b){
       int x = Math.min(a , b);
       int y = Math.max(a , b);

       int z = Math.max(x+x , y);
        System.out.println(z * z);

    }
}
