
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Doubts {
    public static void main(String[] args) {
        int target = 4;
        possibleWays(target , 0 , "");
    }

    static void possibleWays(int target , int current , String ans){
        if(current == target){
            System.out.println(ans);
            return;
        }

        if(current > target){
            return;
        }

//        CHOOSE 1
        possibleWays(target , current+1 , ans+"1 ");

//        CHOOSE 2
        possibleWays(target , current+2 , ans+"2 ");

//        CHOOSE 3
        possibleWays(target , current+3 , ans+"3 ");

    }


}
