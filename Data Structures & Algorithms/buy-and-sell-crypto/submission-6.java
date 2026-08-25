class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, maxProfit = 0;

        for(int r = 0; r < prices.length; r++) {
            int profit = prices[r] - prices[l];
            maxProfit = Math.max(maxProfit, profit);

            if(prices[l] > prices[r]) l = r;
        }
        return maxProfit;
    }
}
