import java.util.Arrays;

public class Doubts {
//    100004 - > 155554

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int brr[] = {100,200,300};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        fun(arr , brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }

    static void fun(int[] a , int[] b){
        int temp[] = a;
        a = b;
        b = temp;
    }
}
