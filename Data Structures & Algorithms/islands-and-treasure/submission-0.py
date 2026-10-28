class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        ROWS, COLS = len(grid), len(grid[0])
        queue = deque()
        visited = set()

        for i in range(ROWS):
            for j in range(COLS):
                if grid[i][j] == 0:
                    queue.append((i, j))
                    visited.add((i, j))
        
        def checkNeighbour(i, j):
            if i < 0 or i >= ROWS or j < 0 or j >= COLS or (i, j) in visited or grid[i][j] == -1:
                return
            
            queue.append((i, j))
            visited.add((i,j))

        distance = 0
        while queue:
            for k in range(len(queue)):
                i, j = queue.popleft()

                grid[i][j] = distance

                checkNeighbour(i, j+1)
                checkNeighbour(i, j-1)
                checkNeighbour(i+1, j)
                checkNeighbour(i-1, j)

            distance += 1