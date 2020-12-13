class Solution:
    def projectionArea(self, grid: List[List[int]]) -> int:
        xy = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]: xy += 1
        yz = sum(max(row) for row in grid)
        xz = sum(max(col) for col in zip(*grid))
        return xy+yz+xz
