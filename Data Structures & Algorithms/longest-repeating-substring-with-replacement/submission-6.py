class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l = 0
        freq = {}
        maxF = 0
        res = 0

        for r, c in enumerate(s):
            freq[c] = 1 + freq.get(c, 0)
            maxF = max(freq[c], maxF)

            while (r - l + 1) - maxF > k:
                freq[s[l]] = freq.get(s[l]) - 1
                l += 1
            
            res = max(res, r - l + 1)
        return res
