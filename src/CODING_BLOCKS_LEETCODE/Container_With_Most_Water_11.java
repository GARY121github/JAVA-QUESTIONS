package CODING_BLOCKS_LEETCODE;

public class Container_With_Most_Water_11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        int s = 0;
        int e = height.length - 1;
        while(s < e){
            int area = (int)Math.min(height[s] , height[e]) * (e - s);
            if(area > maxArea){
                maxArea = area;
            }

            if(height[s] <= height[e])
                s++;
            else
                e--;
        }
        return maxArea;

    }
}
