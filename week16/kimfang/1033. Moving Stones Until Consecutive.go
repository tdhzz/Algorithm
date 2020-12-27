package kimfang

import "sort"

// 1033. 移动石子直到连续
//三枚石子放置在数轴上，位置分别为 a，b，c。
//
//每一回合，我们假设这三枚石子当前分别位于位置 x, y, z 且 x < y < z。从位置 x 或者是位置 z 拿起一枚石子，并将该石子移动到某一整数位置 k 处，其中 x < k < z 且 k != y。
//
//当你无法进行任何移动时，即，这些石子的位置连续时，游戏结束。
//
//要使游戏结束，你可以执行的最小和最大移动次数分别是多少？ 以长度为 2 的数组形式返回答案：answer = [minimum_moves, maximum_moves]
//
//
//
//示例 1：
//
//输入：a = 1, b = 2, c = 5
//输出：[1, 2]
//解释：将石子从 5 移动到 4 再移动到 3，或者我们可以直接将石子移动到 3。
//示例 2：
//
//输入：a = 4, b = 3, c = 2
//输出：[0, 0]
//解释：我们无法进行任何移动。
//
//
//提示：
//
//1 <= a <= 100
//1 <= b <= 100
//1 <= c <= 100
//a != b, b != c, c != a

// 1. 先将abc排队成xyz
// 2.1 如果 r-mid == mid - l == 1 则说明无法移动了
// 2.2 如果 r-mid > 2 && mid - l > 2， 则说明两边都可以移动，往中间靠拢最少需要2步骤，最多需要(r-mid-1) + （mid-l-1） == r+l-2步
// 2.3 剩下的情况就剩下一边无法移动，一边可以移动的情况， 最少需要1步， 最多需要r-l-2步
func numMovesStones(a int, b int, c int) []int {
	nums := []int{a, b, c}
	sort.Ints(nums)
	l, r := nums[1]-nums[0], nums[2]-nums[1]
	if l == 1 && r == 1 {
		return []int{0, 0}
	}
	if l > 2 && r > 2 {
		return []int{2, l + r - 2}
	}
	return []int{1, l + r - 2}
}