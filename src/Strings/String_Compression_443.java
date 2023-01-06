package Strings;

public class String_Compression_443 {
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));
    }

    static int compress(char[] arr) {
      int s = 0;
      int e = 0;
      int count = 0;
      int total = 0;
      while (s < arr.length && e < arr.length){
          if(arr[s] != arr[e]){
              total++;
              while (count > 0){
                  total++;
                  count = count/10;
              }
              s = e;
              count = 0;
          }
          else{
              e++;
              count++;
          }
      }
      total++;
      while (count > 0){
          total++;
          count = count/10;
      }
      return total;
    }
}
