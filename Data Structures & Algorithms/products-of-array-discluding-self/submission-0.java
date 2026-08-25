class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Prefix Calculation (left of i)
        res[0] = 1;

        for(int i = 1; i < n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        // Suffix Calculation + Res Multiplication

        int postfix = 1;
        for(int i = n-1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}