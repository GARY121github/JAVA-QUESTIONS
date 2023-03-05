package LEETCODE_CONTEST;

public class Minimum_Remove_to_Make_Valid_Parentheses_1249 {
    public static void main(String[] args) {
        String st = "(a(b(c)d)";
        Minimum_Remove_to_Make_Valid_Parentheses_1249 ob = new Minimum_Remove_to_Make_Valid_Parentheses_1249();
        System.out.println(ob.minRemoveToMakeValid(st));
    }

    public String minRemoveToMakeValid(String s) {
        return removeInvalid(s , "" , 0 , 0);
    }

    static boolean flag = false;
    static String removeInvalid(String st , String ans , int open , int close){
        if(st.length() == 0){
            if(open == close)
            {
                flag = true;
                return ans;
            }

            return "";
        }

        char ch = st.charAt(0);

        if(ch == '('){
            String f1 =  removeInvalid(st.substring(1) , ans + ch , open+1 , close);
            if(flag){
                return f1;
            }
            else{
                return removeInvalid(st.substring(1) , ans , open , close);
            }
        }
        else if(ch == ')'){
            if(close < open){
                return removeInvalid(st.substring(1) , ans + ch , open , close+1);
            }
            else{
                return removeInvalid(st.substring(1) , ans , open , close);
            }
        }
        else{
            return removeInvalid(st.substring(1) , ans+ch , open , close);
        }
    }
}
