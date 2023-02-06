package GFG;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_two_numbers_represented_by_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] brr = new int[n];
        for(int i = 0 ; i < n ; i++){
            brr[i] = sc.nextInt();
        }

        System.out.println(calcSum(arr , brr));
    }
    static String calcSum(int[] arr , int[] brr){
        int p1 = arr.length-1;
        int p2 = brr.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        while (p1 >= 0 && p2 >= 0){
            int sum = arr[p1] + brr[p2] + carry;
//            System.out.println(sum);
            carry = sum/10;
            int digit = sum%10;
            list.add(0 , digit);

            p1--;
            p2--;
        }
        if(p1 != -1){
            while (p1 >= 0){
                int sum = arr[p1]  + carry;
                carry = sum/2;
                int digit = sum%10;
                list.add(0 , digit);
                p1--;
            }
        }
        if(p2 != -1){
            while (p2 >= 0){
                int sum = brr[p2] + carry;
                carry = sum/2;
                int digit = sum%10;
                list.add(0 , digit);
                p2--;
            }
        }

        if(carry != 0){
            list.add(0 , 1);
        }

        StringBuilder builder = new StringBuilder();
        for(int i : list){
            builder.append(i);
        }
        return builder.toString();
    }

}
