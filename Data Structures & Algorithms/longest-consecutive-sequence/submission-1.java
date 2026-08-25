class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> count = new HashSet<>();

        for(int n : nums) {
            count.add(n);
        }
        
        int record = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	int length = 1;
        	int num = nums[i];
        	if(!count.contains(num-1)) {
        		while(count.contains(num+1)) {
        			length++;
        			num++;
        		}
        	}
        	record = Math.max(record, length);
        }
        return record;
    }
}
