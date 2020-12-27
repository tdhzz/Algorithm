package kimfang
// 530. 二叉搜索树的最小绝对差
//给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
//
//
//
//示例：
//
//输入：
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

// 1. 二叉搜索树的中序遍历是升序的
// 2. 定义一个前节点全局变量
var minus int
var MAX_VAL = int(^uint(0) >> 1)
var pre *TreeNode
func getMinimumDifference(root *TreeNode) int {
	minus = MAX_VAL
	pre = nil
	dfs(root)
	return minus
}

func dfs(root *TreeNode) {
	if root == nil {
		return
	}

	dfs(root.Left)
	if pre != nil {
		minus = min(absDiff(root.Val, pre.Val), minus)
	}
	pre = root
	dfs(root.Right)
}

func min(a int, b int) int {
	if a > b {
		return b
	}
	return a
}

func absDiff(a int, b int) int {
	if a > b {
		return a - b
	}
	return b - a
}