package Recursion;

public class Shapes {
    public static void main(String[] args) {
//        shape1(4, 0);
        shape2(4, 0);
    }

//    SHAPE-1 :->
//    *
//    * *
//    * * *
//    * * * *

    static void shape1(int r , int c){
        if(r == 0)
            return;

        if(r > c){
            shape1(r , ++c);
            System.out.print("* ");
        }
        else{
            shape1(--r , 0);
            System.out.println();
        }
    }

//        SHAPE-2 :->
//        * * * *
//        * * *
//        * *
//        *

    static void shape2(int r, int c) {
        if (r == 0)
            return;

        if (r > c) {
            System.out.print("* ");
            shape2(r, ++c);
        } else {
            System.out.println();
            shape2(--r, 0);
        }
    }
}



