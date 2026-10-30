package Practice;

import java.util.Arrays;

public class runningSum1480 {
    public static int[] runningsum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];

        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningsum(nums)));
    }
}
