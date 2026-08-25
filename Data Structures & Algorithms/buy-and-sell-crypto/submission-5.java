class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, maxProfit = 0;
        
        for(int r = 0; r < prices.length; r++) {
            if(prices[r] > prices[l]) {
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            } else {
                l = r;  // r is the best day to buy on, therefore change to l
            }
        }
        return maxProfit;
    }
}
