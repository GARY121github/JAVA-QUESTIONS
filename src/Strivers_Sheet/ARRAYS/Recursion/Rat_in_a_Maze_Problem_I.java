package Strivers_Sheet.ARRAYS.Recursion;

import java.util.ArrayList;

public class Rat_in_a_Maze_Problem_I {
    public static void main(String[] args) {
        int m[][] = {{1, 0},
                {1, 0}};
        ArrayList<String> list = new ArrayList<>();
        path(m , 0 , 0 , "" , list);
        if(list.size() == 0){
            list.add("-1");
//            return list;
        }
        System.out.println(list);
    }
    static void path(int[][] m, int r , int c,  String ans , ArrayList<String> list) {

        if(r == m.length-1 && c == m[0].length-1){
            if(m[r][c] == 0){
                return;
            }
            list.add(ans);
            return;
        }

        if(r >= m.length || c >= m.length || r < 0 || c < 0 || m[r][c] == 0){
            return;
        }

        m[r][c] = 0;
//        DOWN
        path(m , r+1 , c , ans+'D' , list);
//        up
        path(m , r-1 , c , ans+'U' , list);
//        LEFT
        path(m , r , c-1 , ans+'L', list);
//        RIGHT
        path(m , r , c+1 , ans+'R' , list);
        m[r][c] = 1;
    }
}
