package Mainpackage;

import java.util.*;

public class Redo {

    // LeetCode 283 - Move Zeroes (swap version)
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    // LeetCode 53 - Maximum Subarray (Kadane)
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }

    // LeetCode 242 - Valid Anagram
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c < 0) return false;
        }
        return true;
    }

    // LeetCode 1 - Two Sum (HashMap)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));                              // [1, 3, 12, 0, 0]

        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
        System.out.println(isAnagram("anagram", "nagaram"));                 // true
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));   // [0, 1]
    }
}