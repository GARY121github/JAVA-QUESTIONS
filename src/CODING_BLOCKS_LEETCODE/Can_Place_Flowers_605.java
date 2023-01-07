package CODING_BLOCKS_LEETCODE;

/*

You have a long flowerbed in which some plots are planted, and some are not. However, flowers cannot
be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:
1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

*/
public class Can_Place_Flowers_605 {
    public static void main(String[] args) {
        int[] arr = {1,0};
        int n = 1;
        System.out.println(canPlaceFlowers(arr , n));
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0 && n == 1){
                return true;
            }
            else{
                return false;
            }
        }
       int i = 0;
       while (i < flowerbed.length){
           if(i == 0 && flowerbed[i] == 0 && flowerbed [i+1] != 1){
               n = n-1;
               flowerbed[i] = 1;
           }
           else if(i == flowerbed.length-1 && flowerbed[i] == 0 && flowerbed [i-1] != 1){
               n = n-1;
               flowerbed[i] = 1;
           }
           else if(i !=0 && i!=flowerbed.length-1 && flowerbed[i] == 0 && flowerbed [i+1] != 1 && flowerbed[i-1] != 1){
               n = n-1;
               flowerbed[i] = 1;
           }
           if(n == 0){
               return true;
           }
           i++;
       }
       return false;
    }

}
