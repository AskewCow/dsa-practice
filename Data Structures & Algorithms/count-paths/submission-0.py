class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        grid = [[1] * n for _ in range(m)]

        for i in range(1, m):
            for j in range(1, n):
                paths = 0
                if i > 0:
                    paths += grid[i-1][j]
                if j > 0:
                    paths += grid[i][j-1]
                
                grid[i][j] = paths
        
        return grid[-1][-1]