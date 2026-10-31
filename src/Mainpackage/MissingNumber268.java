package Mainpackage;

public class MissingNumber268 {
    public static int missindNo(int[] nums){
        int n = nums.length;

        int actualSum = n * (n+1) / 2;

        int sum  = 0;
        for(int num : nums){
            sum += num;
        }
        int miss = actualSum-sum;
        return miss;
    }
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missindNo(nums));
    }
}
