package main

//给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。回旋镖 是由点 (i, j, k) 表示的元组 ，其中
// i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
//
// 返回平面上所有回旋镖的数量。
//
//
// 示例 1：
//
//
//输入：points = [[0,0],[1,0],[2,0]]
//输出：2
//解释：两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
//
//
// 示例 2：
//
//
//输入：points = [[1,1],[2,2],[3,3]]
//输出：2
//
//
// 示例 3：
//
//
//输入：points = [[1,1]]
//输出：0
//
//
//
//
// 提示：
//
//
// n == points.length
// 1 <= n <= 500
// points[i].length == 2
// -104 <= xi, yi <= 104
// 所有点都 互不相同
//
// Related Topics 哈希表 数学
// 👍 128 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
func numberOfBoomerangs(points [][]int) int {
	var res int
	m := make(map[int]int)
	length := len(points)
	for i := 0; i < length; i++ {
		for k := range m {
			delete(m, k)
		}

		for j := 0; j < length; j++ {
			if i == j {
				continue
			}
			m[distance(points[i], points[j])]++
		}

		for _, count := range m {
			if count > 1 {
				res += count * (count - 1)
			}
		}
	}
	return res
}

func distance(aPoint, bPoint []int) int {
	return ((aPoint[0] - bPoint[0]) * (aPoint[0] - bPoint[0])) + ((aPoint[1] - bPoint[1]) * (aPoint[1] - bPoint[1]))
}

//leetcode submit region end(Prohibit modification and deletion)
