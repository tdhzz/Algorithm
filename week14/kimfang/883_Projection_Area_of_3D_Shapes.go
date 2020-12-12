package kimfang
//883. 三维形体投影面积
//在 N * N 的网格中，我们放置了一些与 x，y，z 三轴对齐的 1 * 1 * 1 立方体。
//
//每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。
//
//现在，我们查看这些立方体在 xy、yz 和 zx 平面上的投影。
//
//投影就像影子，将三维形体映射到一个二维平面上。
//
//在这里，从顶部、前面和侧面看立方体时，我们会看到“影子”。
//
//返回所有三个投影的总面积。
//
//
//
//示例 1：
//
//输入：[[2]]
//输出：5

func projectionArea(grid [][]int) int {
	size := len(grid)
	ret := 0
	for row := 0; row < size; row++ {
		rowMax, colMax := 0, 0
		for col := 0; col < size; col++ {
			if grid[row][col] != 0 {
				ret++
			}
			if grid[row][col] > rowMax {
				rowMax = grid[row][col]
			}
			if grid[col][row] > colMax {
				colMax = grid[col][row]
			}
		}
		ret += rowMax + colMax
	}
	return ret
}