class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        
        int complement;
        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if(seen.containsKey(complement)) return new int[]{seen.get(complement),i};
            seen.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
