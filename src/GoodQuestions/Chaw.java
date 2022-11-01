package GoodQuestions;

import java.util.Scanner;
/*

    n = 5

   * * * * *
   ____* * * *
   ________* * *
   ____________* *
   ________________*

*/
public class Chaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        pattern_01(n);
        shape_02(n);
    }

    static void shape_01(int n){
        int star = n;
        int space = 0;
        int row = 1;
//        int col = 1;
        while (row <= n){

            // UNDERSCORES
//            ____* * * *
            int sp = 1;
            while (sp <= space){
                System.out.print(' ');
                sp++;
            }

            // STAR
            int st = 1;
            while (st <= star){
                System.out.print("* ");
                st++;
            }
            System.out.println();
            space = space + 4;
            star = star - 1;

            row++;
        }

    }
    /*

    n = 5

       1     ____*
        2    __* * *
         3   * * * * *
        4    __* * *
       5     ____*

    */

    static void shape_02(int n){
        int spaces = n-1;
        int star = 1;
        int row = 1;
        while (row <= n){
            if(row < (n/2 + 1)){

                //SPACES
//                ____
                int sp = 1;
                while (sp <= spaces){
                    System.out.print('_');
                    sp++;
                }
//                *
//                STAR
                int st = 1;
                while (st <= star){
                    System.out.print("* ");
                    st++;
                }

                spaces = spaces - 2;
                star = star + 2;
            }
            else{
                int sp = 1;
                while (sp <= spaces){
                    System.out.print('_');
                    sp++;
                }
//                *
//                STAR
                int st = 1;
                while (st <= star){
                    System.out.print("* ");
                    st++;
                }

                spaces = spaces + 2;
                star = star - 2;
            }

            System.out.println();
            row++;
        }

    }

}
