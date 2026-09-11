class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l, longest = 0, 0
        seen = defaultdict(int)

        for r, c in enumerate(s):
            if c in seen:
                l = max(l, seen[c] + 1)
            
            longest = max(r - l + 1, longest)
            seen[c] = r    
            
        return longest