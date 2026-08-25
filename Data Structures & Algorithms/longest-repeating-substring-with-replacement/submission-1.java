class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();

        int l = 0, maxFreq = 0, res = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            count.put(c, count.getOrDefault(c, 0)+1);
            maxFreq = Math.max(maxFreq, count.get(c));

            while((r-l+1) - maxFreq > k) {
                count.put(s.charAt(l), count.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
