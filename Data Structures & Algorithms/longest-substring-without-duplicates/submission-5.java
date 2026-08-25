class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();

        int l = 0, res = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if(seen.containsKey(c)) {
                l = Math.max(seen.get(c)+1, l);
            }
            seen.put(c, r);
            res = Math.max(res, r - l +1);
        }
        return res;
    }
}
