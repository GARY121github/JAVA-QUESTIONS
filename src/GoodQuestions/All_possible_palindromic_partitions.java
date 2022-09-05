package GoodQuestions;

public class All_possible_palindromic_partitions {
    public static void main(String[] args) {
        possiblePartitions("", "NITIN");
    }

    static void possiblePartitions(String ans , String st){
        if(st.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < st.length() ; i++){
            String prefix = st.substring(0 , i+1);
            String rest = st.substring(i+1);

            if(isPalin(prefix)){
                possiblePartitions( ans + " " +prefix , rest);
            }
        }

    }

    static boolean isPalin(String st){
        int s = 0 ;
        int e = st.length()-1;
        while (s < e){
            if(st.charAt(s) != st.charAt(e))
                return false;

            s++;
            e--;
        }
        return true;
    }
}
