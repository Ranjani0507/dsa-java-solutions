package Mainpackage;

public class BestTimeToBuyAndSellStock121 {
    public static int maxProfit(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            int profit = prices[i] - minprice ;

            if(profit>maxProfit){
                maxProfit = profit;
            }
            if(prices[i]<minprice){
                minprice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

     int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
