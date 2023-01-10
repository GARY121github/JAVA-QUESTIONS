
import java.util.Scanner;

public class Doubts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        if(canPlantTrees(arr, k)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static boolean canPlantTrees(int[] garden, int n) {
        if(n == 0){
            return true;
        }
        if(garden.length == 1){
            return garden[0] == 0 && n == 1;
        }
        int i = 0;
        while (i < garden.length){
            if(i == 0 && garden[i] == 0 && garden[i+1] != 1){
                n = n-1;
                garden[i] = 1;
            }
            else if(i == garden.length-1 && garden[i] == 0 && garden[i-1] != 1){
                n = n-1;
                garden[i] = 1;
            }
            else if(i !=0 && i!=garden.length-1 && garden[i] == 0 && garden[i+1] != 1 && garden[i-1] != 1){
                n = n-1;
                garden[i] = 1;
            }
            if(n == 0){
                return true;
            }
            i++;
        }
        return false;
    }
}
