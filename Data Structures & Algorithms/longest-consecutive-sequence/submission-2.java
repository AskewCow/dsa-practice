class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int res = 0;

        for(int n : nums) {
            seen.add(n);
        }

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(!seen.contains(num-1)) {
                int length = 1;
                while(seen.contains(num+1)) {
                    length++;
                    num++;
                }
                res = Math.max(res, length);
            }

        }
        return res;
    }
}
