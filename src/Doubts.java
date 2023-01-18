
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Doubts {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//
//        System.out.println(arr);
//        System.out.println(list);

//        System.out.println(list.get(0));
        list.add(0 , 1);
        list.add(0 , 2);
        list.add(0, 3);
//        list.add(5 , 4);
        System.out.println(list);

        System.out.println(list.remove(1));
        System.out.println(list);

//        arr[0];
        System.out.println(list.get(1));

//       arr[0] = 1;
        list.set(1 , 20);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
