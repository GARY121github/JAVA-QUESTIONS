package GoodQuestions;

import java.util.ArrayList;

public class Maze_problem {
    public static void main(String[] args) {
//        number_of_ways("", 3 , 3);
        System.out.println(total_number_of_ways("", 3, 3));
    }

    static int count_of_ways(int row , int col){
        if(row == 1 || col == 1)
            return 1;

        int first = count_of_ways(row-1, col);
        int second = count_of_ways(row, col-1);

        return first+second ;
    }

    static void number_of_ways(String processed , int row , int col){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }

        if(row > 1)
            number_of_ways(processed +"D" , row-1 , col);

        if(col > 1)
            number_of_ways(processed +"R" , row , col-1);
    }

    static ArrayList<String> total_number_of_ways(String processed , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(row > 1)
            ans.addAll(total_number_of_ways(processed +"D" , row-1 , col));

        if(col > 1)
            ans.addAll(total_number_of_ways(processed +"R" , row , col-1));

        return ans;
    }
}
