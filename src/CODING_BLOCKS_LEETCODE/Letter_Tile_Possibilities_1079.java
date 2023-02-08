package CODING_BLOCKS_LEETCODE;

public class Letter_Tile_Possibilities_1079 {
    public static void main(String[] args) {
        String st = "AAB";
        int[] arr = new int[26];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            arr[ch - 65]++;
        }
        System.out.println(Possibilities(arr , st , 0 , ""));
    }

    static int Possibilities(int[] arr , String st , int n , String ans){
        if(n == st.length()){
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0){
                arr[i]--;
                count += Possibilities(arr , st , n+1 , ans);
                count += Possibilities(arr , st , n+1 , ans+ (char) (i+65));
                arr[i]++;
            }
        }

        return count;
    }

}
