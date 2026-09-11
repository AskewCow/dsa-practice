class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1
        maxP = 0

        while r < len(prices):
            profit = prices[r] - prices[l]

            if prices[r] > prices[l]:
                maxP = max(profit, maxP)
            else:
                l = r
            r += 1
        
        return maxP
            