package siu

import "fmt"

//给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例:
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
// Related Topics 树 深度优先搜索
// 👍 416 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func binaryTreePaths(root *TreeNode) []string {
	res := []string{}
	dfs(root, "", &res)
	return res
}

func dfs(node *TreeNode, pathStr string, res *[]string) {
	if node == nil {
		return
	}

	if node.Left == nil && node.Right == nil {
		pathStr += fmt.Sprintf("%d", node.Val)
		*res = append(*res, pathStr)
		return
	}

	pathStr += fmt.Sprintf("%d->", node.Val)
	dfs(node.Left, pathStr, res)
	dfs(node.Right, pathStr, res)
}

//leetcode submit region end(Prohibit modification and deletion)
