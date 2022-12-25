package LEETCODE_CONTEST;

//https://leetcode.com/contest/weekly-contest-325/problems/shortest-distance-to-target-string-in-a-circular-array/

public class Shortest_Distance_to_Target_String_in_a_Circular_Array_6269 {
    public static void main(String[] args) {

    }

    static int closeTarget(String[] words, String target, int startIndex) {

        if(words[startIndex].equals(target))
            return 0;

        int count_right = 1;
        boolean flag_right = false;
        int i = startIndex+1;
        if(startIndex == words.length-1){
            i = 0;
        }
        while (i != startIndex){
            if(words[i].equals(target)){
                flag_right = true;
                break;
            }
            count_right++;
            i++;
            if(i == words.length){
                i = 0;
            }
        }

        int count_left = 1;
        boolean flag_left = false;
        i = startIndex-1;
        if(startIndex == 0){
            i = words.length - 1;
        }
        while (i != startIndex){
            if(words[i].equals(target)){
                flag_left = true;
                break;
            }
            count_left++;
            i--;
            if(i == -1){
                i = words.length - 1;
            }
        }

        if(!flag_left && !flag_right){
            return -1;
        }
        else{
            return Math.min(count_left , count_right);
        }
    }
}
