package Strings;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones_1784 {
    public static void main(String[] args) {
        
    }
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') { // found "01".
                return false;
            }
        }
        return true;
    }
}
