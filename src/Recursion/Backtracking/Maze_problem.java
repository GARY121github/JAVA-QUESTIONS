package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze_problem {
    public static void main(String[] args) {
//        number_of_ways("", 3 , 3);
//        System.out.println(total_number_of_ways("", 3, 3));

//        number_of_ways01("" , 3 , 3);
//        System.out.println(total_number_of_ways01("", 3 , 3));

        boolean[][] maze= {
                {true , true ,true},
                {true , true ,true},
                {true , true ,true},
        };

        int[][] steps = new int[maze.length][maze[0].length];

//        number_of_ways_having_obstacle("", maze , 0 , 0);
//        number_of_ways_moving_in_all_directions_with_steps("", maze , 0 , 0);

        number_of_ways_moving_in_all_directions_with_steps("", maze , steps, 0, 0 ,1);

    }

//    CONSTRAIN :-> CAN GO ONLY RIGHT OR DOWN

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

//    CONSTRAIN :-> CAN GO RIGHT OR DOWN OR DIAGONALLY

    static void number_of_ways01(String processed , int row , int col){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }
        if(row > 1 && col > 1)
            number_of_ways01(processed + "D" , row-1 , col-1);

        if(row > 1)
            number_of_ways01(processed +"V" , row-1 , col);

        if(col > 1)
            number_of_ways01(processed +"H" , row , col-1);
    }

    static ArrayList<String> total_number_of_ways01(String processed , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1 && col > 1)
            ans.addAll(total_number_of_ways01(processed + "D" , row-1 , col-1));

        if(row > 1)
            ans.addAll(total_number_of_ways01(processed +"V" , row-1 , col));

        if(col > 1)
            ans.addAll(total_number_of_ways01(processed +"H" , row , col-1));

        return ans;
    }

//        WE CAN GO RIGHT OR DOWN OR DIAGONALLY BUT CAN NOT CROSS OBSTACLE
    static void number_of_ways_having_obstacle(String ans , boolean[][] maze, int row , int col){
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(ans);
            return;
        }

        if(maze[row][col] == false)
            return;

        if(row < maze.length-1 && col < maze[0].length-1)
            number_of_ways_having_obstacle(ans+"d" , maze , row+1 , col+1);

        if(row < maze.length-1)
            number_of_ways_having_obstacle(ans + "v" , maze , row+1 , col);

        if(col < maze[0].length-1)
            number_of_ways_having_obstacle(ans+"h" , maze , row , col+1);
    }

//    WE CAN MOVE IN ALL DIRECTIONS

    static void number_of_ways_moving_in_all_directions_with_steps(String ans , boolean[][] maze, int row , int col){

        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(ans);
            return;
        }

        if(!maze[row][col])
            return;

        maze[row][col] = false;

        if(row < maze.length-1 && col < maze[0].length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans+"D" , maze , row+1 , col+1);

        if(row < maze.length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans + "V" , maze , row+1 , col);

        if(col < maze[0].length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans+"H" , maze , row , col+1);

        if(col > 0)
            number_of_ways_moving_in_all_directions_with_steps(ans+"L", maze, row , col-1);

        if(row > 0)
            number_of_ways_moving_in_all_directions_with_steps(ans+"U" ,maze ,row-1 , col);


        maze[row][col] = true;

    }

    static void number_of_ways_moving_in_all_directions_with_steps(String ans , boolean[][] maze,
                                                                   int[][] steps, int row , int col , int step_number){

        if(row == maze.length-1 && col == maze[0].length-1)
        {
            steps[row][col] = step_number;
            for (int[] i : steps){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(ans);
            System.out.println();

            return;

        }

        if(!maze[row][col])
            return;

        maze[row][col] = false;

        steps[row][col] = step_number;

        if(row < maze.length-1 && col < maze[0].length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans+"D" ,maze , steps,row+1,col+1 , step_number+1);

        if(row < maze.length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans+"V" ,maze, steps , row+1 , col , step_number+1);

        if(col < maze[0].length-1)
            number_of_ways_moving_in_all_directions_with_steps(ans+"H" , maze , steps ,row , col+1 , step_number+1);

        if(col > 0)
            number_of_ways_moving_in_all_directions_with_steps(ans+"L", maze, steps, row ,col-1 ,step_number+1);

        if(row > 0)
            number_of_ways_moving_in_all_directions_with_steps(ans+"U" ,maze ,steps, row-1 , col ,step_number+1);


        maze[row][col] = true;
        steps[row][col] = 0;

    }
}
