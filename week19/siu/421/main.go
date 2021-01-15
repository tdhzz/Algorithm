package main

import "fmt"

//给定一个非空数组，数组中元素为 a0, a1, a2, … , an-1，其中 0 ≤ ai < 231 。
//
// 找到 ai 和aj 最大的异或 (XOR) 运算结果，其中0 ≤ i, j < n 。
//
// 你能在O(n)的时间解决这个问题吗？
//
// 示例:
//
//
//输入: [3, 10, 5, 25, 2, 8]
//
//输出: 28
//
//解释: 最大的结果是 5 ^ 25 = 28.
//
// Related Topics 位运算 字典树
// 👍 208 👎 0

func main() {
	fmt.Println(findMaximumXOR([]int{3, 10, 5, 25, 2, 8}))
}

//leetcode submit region begin(Prohibit modification and deletion)
func findMaximumXOR(nums []int) int {
	maxRes := 0
	for _, num := range nums {
		for _, anotherNum := range nums {
			if num == anotherNum {
				continue
			}
			tmp := num ^ anotherNum
			if tmp > maxRes {
				maxRes = tmp
			}
		}
	}
	return maxRes
}

//leetcode submit region end(Prohibit modification and deletion)
