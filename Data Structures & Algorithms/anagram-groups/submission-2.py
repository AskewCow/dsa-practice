class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # step 1: create hashmap where key = count of each character, value = list of the words
        res = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            res[tuple(count)].append(s)
        
        return list(res.values())     