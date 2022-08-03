package Bitwise;

import java.util.Scanner;

public class Basics {

    static Scanner sc = new Scanner(System.in);

    static void printBinary(int num){
        System.out.print("BINARY OF THE NUMBER " + num + " => ");
        for(int i = 10 ; i >= 0 ; --i){
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    static void SET_BIT(){
//      SET-BIT is the bit where the bit is 1 at the particular position.


        System.out.println("INPUT THE NUMBER");
        int num = sc.nextInt();
        printBinary(num);
        System.out.println("INPUT THE POSITION OF THE BIT TO BE CHECKED IF IT IS SET-BIT OR NOT");
        int pos = sc.nextInt();
        if(isSet(num , pos)){
            System.out.println("BIT IS SET ");
        }
        else {
            System.out.println("BIT IS NOT SET");
        }
    }

    static void SETTING_BIT(){
//      SETING-BIT means to set the bit at the particular position to 1.


        System.out.println("INPUT THE NUMBER");
        int num = sc.nextInt();
        printBinary(num);
        System.out.println("INPUT THE POSITION OF THE BIT YOU NEED TO SET");
        int pos = sc.nextInt();
        num = (1<<pos) | num;
        printBinary(num);

    }

    static void UNSETTING_BIT(){
//      UNSETTING-BIT means to set the bit at the particular position to 0.
        System.out.println("INPUT THE NUMBER");
        int num = sc.nextInt();
        printBinary(num);
        System.out.println("INPUT THE POSITION OF THE BIT YOU NEED TO UN-SET");
        int pos = sc.nextInt();
        num = ~(1<<pos) & num ;
        printBinary(num);
    }

    static void TOGGLE_BIT(){
//      TOGGLING BIT means changing 1 to 0 and vice-versa at the particular position.
        System.out.println("INPUT THE NUMBER");
        int num = sc.nextInt();
        printBinary(num);
        System.out.println("INPUT THE POSITION OF THE BIT YOU NEED TO UN-SET");
        int pos = sc.nextInt();
        num = num ^ (1 << pos);
        printBinary(num);
    }

    static void count_no_of_set_bit(){

        System.out.println("INPUT THE NUMBER");
        int num = sc.nextInt();
        printBinary(num);

        double t = Math.log(num) / Math.log(2);
        int len;
        if(t - (int)t == 0){
            len = (int) t;
        }
        else {
            len = (int) t + 1;
        }

        int count = 0;
        for(int i = len ; i>=0 ; --i){
            if(isSet(num , i)){
                count ++;
            }
        }

        System.out.println("TOTAL NUMBER OF SET BIT IN THE NUMBER => " + count );

    }

    public static void main(String[] args) {

//       SET_BIT();
//       SETTING_BIT();
//       UNSETTING_BIT();
//       TOGGLE_BIT();

        //count_no_of_set_bit();


    }

    static boolean isSet(int num , int pos){
        return ((num & (1<<pos)) != 0);
    }
}
