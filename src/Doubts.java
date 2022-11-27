import java.util.Arrays;
import java.util.Scanner;

public class Doubts {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; sum <= range ; i=i+2){
            sum += i;
            System.out.println(i);
        }
    }
}
