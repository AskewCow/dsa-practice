class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int res = 0;

        for(int n : nums) {
            seen.add(n);
        }

        for(int n : nums) {
            if(seen.contains(n-1)) continue;

            int max = 0;
            while(seen.contains(n)) {
                max++;
                n++;
            }
            res = Math.max(res, max);
        }
        return res;
    }
}