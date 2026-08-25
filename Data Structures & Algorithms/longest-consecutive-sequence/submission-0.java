class Solution {
     public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        
        for(int n : nums) {
        	store.add(n);
        }
        int longest = 0, current = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	int n = nums[i];
        	if(!store.contains(n-1)) {
        		while(store.contains(n)) {
        			current++;
        			n++;
        		}
        	}
        	longest = Math.max(current, longest);
        	current = 0;
        }
        return longest;
    }

}
