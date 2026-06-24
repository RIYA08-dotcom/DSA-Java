//Leetcode 121-Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int minprice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            maxpro=Math.max(maxpro,profit);
        }

        return maxpro;
        
    }
}
