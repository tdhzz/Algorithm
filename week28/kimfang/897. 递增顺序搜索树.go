package kimfang
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func increasingBST(root *TreeNode) *TreeNode {
	var newRoot, tmp *TreeNode = nil, nil
	// 声明内部方法
	var dfs func(root *TreeNode)
	// 定义内部方法
	dfs = func(cur *TreeNode) {
		if cur == nil {
			return
		}
		dfs(cur.Left)
		// 最左节点为新根节点
		if newRoot == nil {
			newRoot = cur
			tmp = cur
		}else {
			cur.Left = nil
			tmp.Right = cur
			tmp = tmp.Right
		}
		dfs(cur.Right)
	}
	// 执行内部方法
	dfs(root)
	return newRoot
}
