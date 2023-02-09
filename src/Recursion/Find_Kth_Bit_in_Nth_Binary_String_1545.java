package Recursion;

public class Find_Kth_Bit_in_Nth_Binary_String_1545 {
    public static void main(String[] args) {

    }
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        int len = (1 << n) - 1;
        if (k == len / 2 + 1) {
            return '1';
        } else if (k > len / 2 + 1) {
            return findKthBit(n - 1, len - k + 1) == '0' ? '1' : '0';
        } else {
            return findKthBit(n - 1, k);
        }
    }
}
