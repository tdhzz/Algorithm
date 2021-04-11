package kimfang
// 104. 二叉树的最大深度
//给定一个二叉树，找出其最大深度。
//
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
//说明: 叶子节点是指没有子节点的节点。
//
//示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回它的最大深度 3 。
//

func maxDepth(root *TreeNode) int {
	return dfs(root)
}

// 求该树的最大深度
func dfs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	left := dfs(root.Left) + 1
	right := dfs(root.Right) + 1
	return max(left, right)
}
func max(l, r int) int {
	if l > r {
		return l
	}
	return r
}