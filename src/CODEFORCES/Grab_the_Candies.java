package CODEFORCES;

import java.util.Scanner;

public class Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int m = 0;
            int c = 0;
            for(int i = 0 ; i < n ; i++){
                if(arr[i] % 2  == 0){
                    m += arr[i];
                }
                else{
                    c += arr[i];
                }
            }

            if(m > c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
