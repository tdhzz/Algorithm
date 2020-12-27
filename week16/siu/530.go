package siu

import "math"

//给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
//
//
//
// 示例：
//
// 输入：
//
//   1
//    \
//     3
//    /
//   2
//
//输出：
//1
//
//解释：
//最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
//
//
//
//
// 提示：
//
//
// 树中至少有 2 个节点。
// 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
//相同
//
// Related Topics 树
// 👍 218 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

var pre int
var res int

func getMinimumDifference(root *TreeNode) int {
	pre = -1
	res = math.MaxInt64
	dfs530(root)
	return res
}

func dfs530(node *TreeNode) {
	if node == nil {
		return
	}

	dfs530(node.Left)
	if pre != -1 && node.Val-pre < res {
		res = node.Val - pre
	}
	pre = node.Val
	dfs530(node.Right)
}

//leetcode submit region end(Prohibit modification and deletion)
