class Solution {
    private int[][] directions = new int[][]{{1, 0}, {-1, 0}, 
        {0, 1}, {0,-1}};

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int islands = 0;

        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int i, int j) {
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0
            || grid[i][j] == '0') return;

        grid[i][j] = '0';

        for(int[] dir : directions) {
            dfs(grid, i + dir[0], j + dir[1]);
        }
    }
}
