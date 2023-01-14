package Strings;

public class Maximum_Repeating_Substring_1668 {
    public static void main(String[] args) {

    }
    static int maxRepeating(String sequence, String word) {
        if(word.length() > sequence.length())
            return 0;

        int count = 0;
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < sequence.length() ; i++){
            builder.append(sequence.charAt(i));

            if(builder.toString().equals(word)){
                count++;
                builder.delete(0 , builder.length());
            }
        }
        return count;
    }
}
