
import java.util.*;
//public class prac{
//	public static void reverse(int[] nums) {
//		int left = 0;
//		int right = nums.length-1;
//		while(left<right) {
//			int temp = nums[left];
//			nums[left] = nums[right];
//			nums[right] = temp;
//
//			left++;
//			right--;
//		}
//
//	}
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4,5};
//		reverse(nums);
//		System.out.println(Arrays.toString(nums));
//	}
//}
//
//import java.util.Arrays;
//
//public class prac {
//    public static void moveZero(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//        }
//    }
//        public static void main(String[] args){
//           int[] nums = {0};
//           moveZero(nums);
//            System.out.println(Arrays.toString(nums));
//        }
//
//}
//
//public class prac {
//    public static int maxSub(int[] nums){
//        int sum = 0;
//        int maxSum = nums[0];
//
//        for(int i=0;i<nums.length;i++){
//            sum += nums[i];
//
//            if(sum>maxSum) maxSum = sum;
//
//            if(sum<0) sum = 0;
//        }
//        return maxSum;
//    }
//    public static void main(String[] args) {
//        int[] nums = {-3, -1, -2};
//        System.out.println(maxSub(nums));
//    }
//}
//
//public class prac {
//    public static boolean isAnagram(String s,String t){
//        if(s.length() != t.length()) return false;
//
//        int count[] = new int[26];
//
//        for(int i=0;i<s.length();i++){
//            count[s.charAt(i) - 'a']++;
//            count[t.charAt(i) - 'a']--;
//
//        }
//        for(int c : count){
//            if(c<0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
//        System.out.println(isAnagram(s,t));
//
//    }
//}
//
//import java.util.HashMap;
//
//public class prac {
//    public static boolean isangram(String s,String t){
//        if(s.length() != t.length()) return false;
//
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(int i=0;i<t.length();i++){
//            map.put(t.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
//
//            if(map.get(t.charAt(i))<0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//    String s = "madam";
//    String t = "mmaa";
//        System.out.println(isangram(s,t));
//    }
//}

public class prac {
    public static int[] twoSum(int[] nums,int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};

             seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}