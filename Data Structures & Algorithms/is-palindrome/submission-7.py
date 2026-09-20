class Solution:
    def isPalindrome(self, s: str) -> bool:
        def isValidChar(c: str) -> bool:
            return ord('a') <= ord(c) <= ord('z') or ord('A') <= ord(c) <= ord('Z') or ord('0') <= ord(c) <= ord('9')
        l, r = 0, len(s) - 1

        while l < r:
            leftChar = s[l]
            rightChar = s[r]

            while l < r and not isValidChar(leftChar):
                l += 1
                leftChar = s[l]
            while l < r and not isValidChar(rightChar):
                r -= 1
                rightChar = s[r]
            
            if leftChar.lower() != rightChar.lower():
                return False
            l += 1
            r -= 1
        return True