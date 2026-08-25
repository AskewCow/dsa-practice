class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = buckets.length-1; i > 0 && index < k; i--) {
            for(int j : buckets[i]) {
                res[index++] = j;
                if(index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
