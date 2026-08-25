class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new LinkedList<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] pair = stack.remove();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{temp, i});
        }
        return res;
    }
}
