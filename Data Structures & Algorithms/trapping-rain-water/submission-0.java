class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;

        int l = 0, r = height.length-1, maxWater = 0;
        int maxLeft = height[0], maxRight = height[r]; 
        int res = 0;

        while(l < r) {
            if(height[l] < height[r]) {
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                res += maxLeft - height[l];
            } else {
                r--;
                maxRight = Math.max(maxRight, height[r]);
                res += maxRight-height[r];
            }
        }
    return res;
    }
}
