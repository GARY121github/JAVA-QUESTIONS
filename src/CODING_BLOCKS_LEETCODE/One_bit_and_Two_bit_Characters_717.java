package CODING_BLOCKS_LEETCODE;

/*

We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.



Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.

Constraints:

1 <= bits.length <= 1000
bits[i] is either 0 or 1.

*/
public class One_bit_and_Two_bit_Characters_717 {
    public static void main(String[] args) {
        int[] bits = {1,1,1,0};
        System.out.println(isOneBitCharacter(bits));
    }

    static boolean isOneBitCharacter(int[] bits) {
        int count_1 = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] == 1; i--) count_1++;
        return (count_1 % 2 == 0);
    }
}
