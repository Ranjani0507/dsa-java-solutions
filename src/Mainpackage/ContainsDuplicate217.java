package Mainpackage;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums){
    HashSet<Integer> map = new HashSet<>();

    for(int num : nums){
        if(map.contains(num)){
            return true;
        }
        map.add(num);
    }
    return false;
    }
    public static void main(String[] args) {
         int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }
}
