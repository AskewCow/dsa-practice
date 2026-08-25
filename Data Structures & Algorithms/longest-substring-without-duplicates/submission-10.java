class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int longest = 0, l = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if(seen.containsKey(c)) {
                l = Math.max(seen.get(s.charAt(r))+1, l);
            }
            longest = Math.max(longest, r-l+1);
            seen.put(c, r);
        }
        return longest;
    }
}
