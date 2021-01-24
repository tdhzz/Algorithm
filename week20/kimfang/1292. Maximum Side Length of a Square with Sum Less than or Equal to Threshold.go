package kimfang

// 1292. 元素和小于等于阈值的正方形的最大边长
//给你一个大小为 m x n 的矩阵 mat 和一个整数阈值 threshold。
//
//请你返回元素总和小于或等于阈值的正方形区域的最大边长；如果没有这样的正方形区域，则返回 0 。
//
//
//示例 1：
//
//
//
//输入：mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
//输出：2
//解释：总和小于 4 的正方形的最大边长为 2，如图所示。
//示例 2：
//
//输入：mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
//输出：0
//示例 3：
//
//输入：mat = [[1,1,1,1],[1,0,0,0],[1,0,0,0],[1,0,0,0]], threshold = 6
//输出：3
//示例 4：
//
//输入：mat = [[18,70],[61,1],[25,85],[14,40],[11,96],[97,96],[63,45]], threshold = 40184
//输出：2
//
//
//提示：
//
//1 <= m, n <= 300
//m == mat.length
//n == mat[i].length
//0 <= mat[i][j] <= 10000
//0 <= threshold <= 10^5

func maxSideLength(mat [][]int, threshold int) int {
	n, m := len(mat), len(mat[0])
	sum := make([][]int, n+1)
	for i := 0; i <= n; i++ {
		sum[i] = make([]int, m+1)
	}
	for i := 0; i < n; i++ {
		t := 0
		for j := 0; j < m; j++ {
			t += mat[i][j]
			sum[i+1][j+1] = t + sum[i][j+1]
		}
	}
	max := 0
	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			for k := 0; i+k <= n && j+k <= m; k++ {
				x, y := i+k, j+k
				v := sum[x][y] - sum[i-1][y] - sum[x][j-1] + sum[i-1][j-1]
				if v <= threshold && max < k+1 {
					max = k + 1
				}
				if v >= threshold {
					break
				}
			}
		}
	}
	return max
}