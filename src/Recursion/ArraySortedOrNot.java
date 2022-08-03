package Recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int a[] = {1 , 2 , 3 , 4 , 5};
        System.out.println(isSorted(a , 0));
    }

    private static boolean isSorted(int[] a, int i) {
        if(i == a.length-1)
            return true;

        if(a[i] > a[i+1])
            return false;

        return isSorted(a, ++i);

    }
}
