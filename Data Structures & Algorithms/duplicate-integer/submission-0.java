class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> records = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(records.containsKey(nums[i])) return true;
            records.put(nums[i], i);
        }
        return false;
    }
}