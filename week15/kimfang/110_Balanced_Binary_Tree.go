package kimfang
// 110. 平衡二叉树
//给定一个二叉树，判断它是否是高度平衡的二叉树。
//
//本题中，一棵高度平衡二叉树定义为：
//
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
//
//
//
//示例 1：
//
//
//输入：root = [3,9,20,null,null,15,7]
//输出：true
//示例 2：
//
//
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
//示例 3：
//
//输入：root = []
//输出：true
//
//
//提示：
//
//树中的节点数在范围 [0, 5000] 内
//-104 <= Node.val <= 104
//通过次数158,025提交次数287,510
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isBalanced(root *TreeNode) bool {

	return helper(root)
}

func helper(root *TreeNode) bool {
	if root == nil {
		return true
	}
	diff := getMaxDepth(root.Left) - getMaxDepth(root.Right)
	if diff >= -1 && diff <= 1 {
		return helper(root.Left) && helper(root.Right)
	}
	return false
}

// 1. 递归
func getMaxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	lDepth := getMaxDepth(root.Left)
	rDepth := getMaxDepth(root.Right)

	return max(lDepth, rDepth) + 1
}
// 2. todo 迭代

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}