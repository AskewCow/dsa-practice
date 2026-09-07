class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i in range(len(nums)):
            remaining = target - nums[i]
            if remaining in seen:
                return [seen.get(remaining), i]
            seen[nums[i]] = i

        return [-1,-1]