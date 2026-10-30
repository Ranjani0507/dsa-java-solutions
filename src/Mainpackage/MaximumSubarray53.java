package Mainpackage;

public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums){
        int currentsum = 0;
        int maxSum = nums[0];
        for(int i=0;i<nums.length;i++){
            currentsum += nums[i];

            if(currentsum>maxSum){
                maxSum = currentsum;
            }
            if(currentsum<0)
            {
                currentsum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
           int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
