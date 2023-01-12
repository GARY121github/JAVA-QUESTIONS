package Strings;

public class Split_Two_Strings_to_Make_Palindrome_1616 {
    public static void main(String[] args) {

    }
    static boolean checkPalindromeFormation(String a, String b) {
        int s = 0;
        int e = a.length()-1;
        int flag = 0;
        while(s < e){
            if(a.substring(0,s).equals(b.substring(e))){
                flag++;
            }
            else{
                break;
            }
            s++;
            e--;
        }
        if(flag > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
