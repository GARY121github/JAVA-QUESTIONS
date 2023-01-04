package CODING_BLOCKS_LEETCODE;

public class Fair_Candy_Swap_888 {
    public static void main(String[] args) {

    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < A.length; i++)
            sumA += A[i];
        for (int i = 0; i < B.length; i++)
            sumB += B[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] - B[j] == dif)
                    return new int[]{A[i], B[j]};
            }
        }
        return null;
    }
}
