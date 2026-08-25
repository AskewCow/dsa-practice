class Solution {
    private static final int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};

    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int maxArea = 0;

        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                } 
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
            || grid[i][j] == 0) return 0;

        grid[i][j] = 0;
        int res = 1;

        for(int[] dir : directions) {
            res += dfs(grid, i + dir[0], j + dir[1]);
        }

        return res;
    } 
}
