package Mainpackage;

import java.util.Arrays;

public class TwoSum1 {
    public static int[] twosum(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = nums[left] + nums[right];
            if(mid == target){
                return new int[]{left,right};
            }
            else if(mid<target){
              left++;
        }
            else right--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }
}
