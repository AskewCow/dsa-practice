class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        def checkArr(s1Arr, s2Arr) -> bool:
            for i in range(len(s1Arr)):
                if s1Arr[i] != s2Arr[i]:
                    return False
            return True
        
        if len(s1) > len(s2):
            return False
        
        s1Arr = [0] * 26
        s2Arr = [0] * 26

        for c in s1:
            s1Arr[ord(c) - ord('a')] += 1
        
        l = 0

        for r in range(len(s2)):
            s2Arr[ord(s2[r]) - ord('a')] += 1
            while (r - l + 1) > len(s1):
                s2Arr[ord(s2[l]) - ord('a')] -= 1
                l += 1
            if checkArr(s1Arr, s2Arr):
                return True
        return False

