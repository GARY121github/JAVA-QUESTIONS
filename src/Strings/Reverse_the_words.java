package Strings;

import java.util.Arrays;

public class Reverse_the_words {
    public static void main(String[] args) {
        String st = "Radha     Sharma kdnfkdan kdnafklnd ";
        String[] arr = st.split(" ");
        System.out.println(Arrays.toString(arr));
        String[] brr = st.split("\s+");
        System.out.println(Arrays.toString(brr));
    }
}
