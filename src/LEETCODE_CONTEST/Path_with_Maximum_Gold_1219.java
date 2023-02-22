package LEETCODE_CONTEST;

public class Path_with_Maximum_Gold_1219 {
    public static void main(String[] args) {

    }
    static int getMaximumGold(int[][] grid)
    {

        int maxGold = 0; // Declare a return value - we need two values in order to "hot potato" possible max gold values, this one is the first.

        for(int i = 0; i < grid.length; i++) // The nested for loops will search the random spot that we will begin for it.
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] != 0) // Problem description state that we can begin the search at any spot, so we find one that is not empty.
                {
                    maxGold = Math.max(maxGold ,helper(grid, i, j)); // The helper method is the second value in which we will "hot potato" possible max gold values.
                }
            }
        }
        return maxGold; // Returns the final max value.
    }

    static int helper(int[][] grid, int x, int y)
    {
        if(x < 0 || grid.length-1 < x || y < 0 || grid[0].length-1 < y || grid[x][y] == 0) // Checks for valid boundris and spots with zero gold.
        {
            return 0;
        }

        int temp = grid[x][y]; // Make a copy of a current spot which has gold in it.

        grid[x][y] = 0; // Overwrite the current spots value to zero so that we will know that we have been here before. (for the rest of the current iteration).

        int up = helper(grid, x-1, y);         // Ways to traversing the matrix.
        int down = helper(grid, x+1, y);
        int left = helper(grid, x, y-1);
        int right = helper(grid, x, y+1);

        grid[x][y]= temp; // Overwrite the current spots value back to the original value for the next iteration (we haave changed the value before and we need to "fix" the matrix values back to the original ones).

        return  Math.max(Math.max(Math.max(left,right),up),down) + temp; // Return the max sum of gold collected in a single iteration.

    }
}
