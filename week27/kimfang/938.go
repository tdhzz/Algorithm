package kimfang
// 938. 二叉搜索树的范围和
//给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
//
//
//
//示例 1：
//
//
//输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
//输出：32
//示例 2：
//
//
//输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//输出：23
//
//
//提示：
//
//树中节点数目在范围 [1, 2 * 104] 内
//1 <= Node.val <= 105
//1 <= low <= high <= 105
//所有 Node.val 互不相同
//通过次数47,304提交次数60,603
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func rangeSumBST(root *TreeNode, low int, high int) int {
	return dfs(root, low, high)
}
// 查询给定节点二叉树，指定范围所有节点的和
func dfs(root *TreeNode, low int, high int) int {
	if root == nil {
		return 0
	}
	// 前序遍历的位置(操作root节点)
	leftSum := dfs(root.Left, low, high)
	// 中序遍历的位置
	rightSum := dfs(root.Right, low, high)
	// 后续遍历
	rootVal := 0
	if root.Val >= low && root.Val <= high {
		rootVal = root.Val
	}
	return rootVal + leftSum + rightSum
}