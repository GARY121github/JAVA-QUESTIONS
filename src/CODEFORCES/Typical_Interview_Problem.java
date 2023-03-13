package CODEFORCES;

import java.util.Scanner;

public class Typical_Interview_Problem {
    public static void main(String[] args) {
        String st = "FBFFBFFBFBFBFFBFFBFBFBFFBFFBFB";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int k = sc.nextInt();
            String str = sc.next();
            boolean flag = false;
            int s = 0 ;
            int e = k ;
            while (e <= st.length()){

                String current = st.substring(s , e);

                if(current.compareTo(str) == 0){
                    flag = true;
                    break;
                }

                s++;
                e++;
            }

            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
