class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxProfit = 0;

        for(int r = 0; r < prices.length; r++) {
            if(prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
        }
        return maxProfit;
    }
}
