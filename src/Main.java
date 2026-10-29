import java.util.*;

// public class practice{
//     public static int rich(int[][] accounts){
//         int max = 0;

//         for(int i=0;i<accounts.length;i++){
//             int sum = 0;
//             for(int j=0;j<accounts[i].length;j++){
//                  sum += accounts[i][j];

//             }
//             if(sum>max){
//                 max = sum;
//             }

//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},
//                        {4,5,6}};

//        int ans = rich(arr);
//        System.out.println(ans);
//     }
// }
// import java.util.*;
// public class practice{
//     public static int[] concate(int[] nums){
//         int n = nums.length;
//                int[] arr = new int[2*n];
//         for(int i=0;i<n;i++){
//             arr[i] = nums[i];
//             arr[i+n] = nums[i];
//         }

//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,1};
//         int[] ans = concate(arr);
//           System.out.println(Arrays.toString(ans));
//     }
// }
//public class Main {
//    public static  int[] runningSum(int[] nums){
//        for(int i=1;i<nums.length;i++){
//            nums[i] = nums[i] + nums[i-1];
//        }
//        return nums;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] ans = runningSum(arr);
//        System.out.print(Arrays.toString(ans) +" ");
//    }
////}
//public class Main {
//    public static void reverse(int[] arr){
//        int left = 0;
//        int right = arr.length-1;
//
//        while(left<right){
//            int temp = arr[left];
//            arr[left]  = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1};
//        reverse(arr);
//        System.out.print(Arrays.toString(arr));
//    }
//}

//
//public class Main {
//    public static int[] large_secondlarge(int[] arr){
//      int second = Integer.MIN_VALUE;
//      int max = Integer.MIN_VALUE;
//      for(int i=0;i<arr.length;i++){
//          if(arr[i]>max){
//              second = max;
//              max = arr[i];
//
//          }
//          else if(arr[i]>second && arr[i] <max){
//              second = arr[i];
//          }
//
//      }
//      return new int[] {max,second};
//
//    }
//    public static void main(String[] args) {
//        int[] arr = {3,4,5,3,6};
//        int[] nn = large_secondlarge(arr);
//        System.out.print(Arrays.toString(nn));
//
//    }
//}
//
//public class Main {
//    static int[] build(int[] nums){
//        int n = nums.length;
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = nums[nums[i]];
//        }
//        return arr;
//    }
//    public static void main(String[] aega){
//
//        int[] nums ={0, 2, 1, 5, 3, 4};
//        int[] arr = build(nums);
//        System.out.print(Arrays.toString(arr));
//
//
//    }
//}
//
//public class Main {
//    public static boolean check(int[] nums){
//        int n = nums.length;
//        int count = 0;
//
//        for(int i=0;i<n;i++){
//            if(nums[i]>nums[(i+1) % n]){
//                count++;
//            }
//        }
//        return count<=1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {4,5,1,2,3};
//        System.out.print(check(arr));
//    }
//}
//
//public class Main{
//    public void reverseString(char[] s){
//        int left = 0;
//        int right = s.length-1;
//        while(left<right){
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//
//            left++;
//            right--;
//        }
//    }
//    public static void main(String[] args){
//        char[] ch = {'h','e','l','l','o'};
//        Main obj = new Main();
//        obj.reverseString(ch);
//        System.out.print(Arrays.toString(ch));
//
//    }
//}
//
//public class Main{
//    public static int[] moveZero(int[] nums){
//        int j = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] != 0){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        while(j<nums.length){
//            nums[j] = 0;
//            j++;
//        }
//        return nums;
//    }
//    public static void main(String[] args){
//        int[] nums = {0,1,0,3,12};
//        System.out.print(Arrays.toString(moveZero(nums)));
//    }
//}
//
//public class Main{
//    public static  int remove(int[] nums){
//        int j=1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] != nums[i-1]){
//
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }
//    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int k = remove(nums);
//        System.out.println(k);
//        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
//    }
//}