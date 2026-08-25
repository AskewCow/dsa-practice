class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> seen = new HashMap<>();  // <character, count>
        int l = 0, res = 0, maxCount = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            seen.put(c, seen.getOrDefault(c, 0)+1);
                        maxCount = Math.max(maxCount, seen.get(c));

            while(r - l + 1 - maxCount > k) {
                seen.put(s.charAt(l), seen.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
