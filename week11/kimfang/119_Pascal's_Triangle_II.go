package main

//119. 杨辉三角 II
//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//
//示例:
//
//输入: 3
//输出: [1,3,3,1]

func getRow(rowIndex int) []int {
	triangle := make([][]int, rowIndex + 1)
	// 初始化三角形
	for i := range triangle {
		r := make([]int, i+1)
		r[0] = 1
		if i > 0 {
			r[i] = 1
		}
		triangle[i] = r
	}
	// 填充空白
	for r, row := range triangle {
		for c := range row {
			if row[c] == 0 {
				row[c] = triangle[r-1][c-1] + triangle[r-1][c]
			}
		}
	}
	return triangle[rowIndex]
}
