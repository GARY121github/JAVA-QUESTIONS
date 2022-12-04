package LEETCODE_CONTEST;

//https://leetcode.com/contest/weekly-contest-322/problems/divide-players-into-teams-of-equal-skill/

import java.util.Arrays;

public class Divide_Players_Into_Teams_of_Equal_Skill_6254 {
    public static void main(String[] args) {
       int[] skill = {1,1,2,3};
        System.out.println(divide(skill));
    }

    static long divide(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int p1 = 0;
        int p2 = arr.length-1;
        long data = (long) arr[0] + arr[arr.length - 1];
        long ans = 0;
        while (p1 < p2){
            long temp = arr[p1]+arr[p2];

            if(temp != data){
                return -1;
            }
            else {
//                System.out.println("Ans of" + arr[p1] + " " + arr[p2] + " => " + temp);
                ans += (arr[p1]*arr[p2]);
            }

            p1++;
            p2--;
        }
        return ans;
    }
}
