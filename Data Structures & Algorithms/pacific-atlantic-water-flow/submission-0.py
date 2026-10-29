class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        ROWS, COLS = len(heights), len(heights[0])
        pacific_set = set()
        pacific_q = deque()

        atlantic_set = set()
        atlantic_q = deque()

        for m in range(ROWS):
            pacific_set.add((m, 0)) # Left
            pacific_q.append((m, 0))

            atlantic_set.add((m, COLS - 1)) # Right
            atlantic_q.append((m, COLS - 1))

        for n in range(COLS):
            pacific_set.add((0, n)) # Top
            pacific_q.append((0, n))

            atlantic_set.add((ROWS - 1, n)) # Bottom
            atlantic_q.append((ROWS - 1, n))

        def checkNeighbours(m, n, heightNeighbour, pacific):
            if pacific and (m < 0 or n < 0 or m >= ROWS or n >= COLS or (m, n) in pacific_set or heights[m][n] < heightNeighbour):
                return
            if not pacific and (m < 0 or n < 0 or m >= ROWS or n >= COLS or (m, n) in atlantic_set or heights[m][n] < heightNeighbour):
                return

            if pacific:
                pacific_set.add((m, n))
                pacific_q.append((m, n))
            else:
                atlantic_set.add((m, n))
                atlantic_q.append((m, n))
            return

        while pacific_q:
            m, n = pacific_q.popleft()
            height = heights[m][n]

            checkNeighbours(m+1, n, height, True)
            checkNeighbours(m-1, n, height, True)
            checkNeighbours(m, n+1, height, True)
            checkNeighbours(m, n-1, height, True)

        while atlantic_q:
            m, n = atlantic_q.popleft()
            height = heights[m][n]

            checkNeighbours(m+1, n, height, False)
            checkNeighbours(m-1, n, height, False)
            checkNeighbours(m, n+1, height, False)
            checkNeighbours(m, n-1, height, False)

        return [list(coord) for coord in pacific_set & atlantic_set]