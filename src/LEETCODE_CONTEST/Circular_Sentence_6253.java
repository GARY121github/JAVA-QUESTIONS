package LEETCODE_CONTEST;

//https://leetcode.com/contest/weekly-contest-322/problems/circular-sentence/

public class Circular_Sentence_6253 {
    public static void main(String[] args) {
        String st = "Leetcode is cool";
        System.out.println(isCircular(st));
    }

    static boolean isCircular(String st){
        String[] arr = st.split(" ");
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i].charAt(arr[i].length() - 1) != arr[i+1].charAt(0)){
                return false;
            }
        }
        if(arr[arr.length - 1].charAt(arr[arr.length-1].length() - 1) != arr[0].charAt(0)){
            return false;
        }

        return true;
    }
}
