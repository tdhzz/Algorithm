package kimfang

import "strconv"

// 257. 二叉树的所有路径
//给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
//说明: 叶子节点是指没有子节点的节点。
//
//示例:
//
//输入:
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

type TreeNode struct {
	Val int
	Left *TreeNode
	Right *TreeNode
}

var ret []string

func binaryTreePaths(root *TreeNode) []string {
	if root == nil {
		return make([]string, 0)
	}
	ret = make([]string, 0)
	var path = strconv.Itoa(root.Val)
	dfs(root.Left, root.Right, path)
	return ret
}

func dfs(left *TreeNode, right *TreeNode, path string) {
	if left == nil && right == nil {
		ret = append(ret, path)
		return
	}
	if left != nil {
		path1 := path+"->"+strconv.Itoa(left.Val)
		dfs(left.Left, left.Right, path1)
	}
	if right != nil {
		path1 := path+"->"+strconv.Itoa(right.Val)
		dfs(right.Left, right.Right, path1)
	}
}