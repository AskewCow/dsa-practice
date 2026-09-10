class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def checkEatingSpeed(k: int) -> int:
            hours = 0
            for p in piles:
                hours += math.ceil(p / k)

            return hours

        # l pointer = 1, can't eat 0 banana
        # r pointer = max(piles), fastest way to eat each pile
        l, r = 1, max(piles)

        while l < r:
            k = l + (r - l) // 2
            hours = checkEatingSpeed(k)

            if hours > h:
                l = k + 1
            else:
                r = k
        
        return l