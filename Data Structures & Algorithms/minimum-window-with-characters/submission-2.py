class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) < len(t):
            return ""

        tCount = defaultdict(int)
        window = defaultdict(int)

        for c in t:
            tCount[c] += 1

        res = [0, float("inf")]

        l, have, need = 0, 0, len(tCount)
        for r in range(len(s)):
            window[s[r]] += 1
            if s[r] in tCount and window[s[r]] == tCount[s[r]]:
                have += 1
            while have == need:
                if r - l + 1 < res[1] - res[0] + 1:
                    res = [l, r]
                if s[l] in tCount and window[s[l]] == tCount[s[l]]:
                    have -= 1
                window[s[l]] -= 1
                l += 1

        if res[1] == float("inf"):
            return ""
        return s[res[0] : res[1] + 1]
            
            