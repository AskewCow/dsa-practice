class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        coins.sort()
        dp = [0] * (amount + 1)

        for i in range(1, amount + 1):
            min_amt = float('inf')
            for coin in coins:
                diff = i - coin

                if diff < 0:
                    break

                min_amt = min(min_amt, 1 + dp[diff])
            
            dp[i] = min_amt
        
        if dp[-1] != float('inf'):
            return dp[-1]
        else:
            return -1