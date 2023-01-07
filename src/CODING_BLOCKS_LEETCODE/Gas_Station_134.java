package CODING_BLOCKS_LEETCODE;

public class Gas_Station_134 {

    public static void main(String[] args) {

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int position = 0;
        int currentPosition = 0;
        for(int i = 0 ; i < cost.length ; i++){
            sum += gas[i] - cost[i];
            currentPosition += gas[i] - cost[i];
            if(currentPosition < 0){
                position = i+1;
                currentPosition = 0;
            }
        }
        if(sum < 0)
            return -1;

        return position;
    }
}
