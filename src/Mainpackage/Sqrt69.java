package Mainpackage;

public class Sqrt69 {
    public static int sqrt(int x){
        int left  =0;
        int right = x;
        int ans = 0 ;
        while(left<=right){
            int mid = left+(right-left)/2;
          long squer =(long)  mid * mid;

            if(squer == x) {
                return mid;
            }
            else if(squer<x) {
                ans = mid;
                left = mid + 1;}

            else right = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
     int x = 8;
        System.out.println(sqrt(x));
    }
}
