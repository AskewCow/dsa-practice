class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        m, n = len(grid), len(grid[0]) # m is rows, n is columns

        def dfs(i: int, j: int):
            if i < 0 or i >= m or j < 0 or j >= n or grid[i][j] != '1':
                return

            grid[i][j] = '0'
            dfs(i, j+1)
            dfs(i, j-1)
            dfs(i+1, j)
            dfs(i-1, j)

            return

        island_count = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j] == '1':
                    island_count += 1
                    dfs(i, j)
        
        return island_count