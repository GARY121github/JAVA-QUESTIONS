package Arrays.Searching;

public class LinearSearching {
    public static void main(String args[]){

        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println("Target found at position = " + linear(a , target) );

    }

    private static int linear(int[] a, int target) {

        for(int i = 0 ; i<a.length ; i++){
            if(a[i] == target){
                return i+1;
            }
        }
        return -1;
    }
}
