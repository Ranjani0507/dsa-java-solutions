package Mainpackage;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int max = 0;

        while(left<right){
            int width = right - left;
            int h = Math.min(nums[left],nums[right]);
            int area = width*h;
            max = Math.max(area,max);

            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
         int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
