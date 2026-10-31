package Mainpackage;

import java.util.HashMap;

public class MajorityElement169 {
    public static int major(int[] nums){
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)>nums.length/2) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(major(nums));
    }
}
