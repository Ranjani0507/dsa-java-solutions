package Mainpackage;

import java.util.Arrays;

public class FirstLastPosition34 {
    public static int[] searchRange(int[] nums,int target){
        int first = first(nums,target);
        int last = last(nums,target);

        return new int[]{first,last};
    }
    public static int first(int nums[],int  target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            }
            else if(nums[mid]<target) left = mid + 1;
            else right = mid - 1;
        }
        return first;
    }
    public static int last(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int last = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target)  {
                last = mid;
                left = mid + 1;
            }
            else if(nums[mid]<target) left = mid  + 1;
            else right = mid - 1;


        }
        return last;
    }
    public static void main(String[] args) {
       int[] nums = {1,2,7,7,8,8,10};
       int target = 8;

        System.out.println(Arrays.toString(searchRange(nums,target)));

           }
}
