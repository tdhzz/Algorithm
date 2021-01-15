package main

import "fmt"

//给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
//
//
//
// 示例 1：
//
//
//输入：n = 5
//输出：true
//解释：5 的二进制表示是：101
//
//
// 示例 2：
//
//
//输入：n = 7
//输出：false
//解释：7 的二进制表示是：111.
//
// 示例 3：
//
//
//输入：n = 11
//输出：false
//解释：11 的二进制表示是：1011.
//
// 示例 4：
//
//
//输入：n = 10
//输出：true
//解释：10 的二进制表示是：1010.
//
// 示例 5：
//
//
//输入：n = 3
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= n <= 231 - 1
//
// Related Topics 位运算
// 👍 88 👎 0

func main() {
	fmt.Println(hasAlternatingBits(5))
}

//leetcode submit region begin(Prohibit modification and deletion)
func hasAlternatingBits(n int) bool {
	pre := n & 1
	n = n >> 1
	this := n & 1
	for n != 0 {
		if this == pre {
			return false
		}
		pre = this
		n = n >> 1
		this = n & 1
	}
	return true
}

//leetcode submit region end(Prohibit modification and deletion)
