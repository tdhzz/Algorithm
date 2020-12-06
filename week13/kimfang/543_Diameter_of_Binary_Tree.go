package week_13

//543. 二叉树的直径
//给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
//
//
//
//示例 :
//给定二叉树
//
//          1
//         / \
//        2   3
//       / \
//      4   5
//返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
//
//
//
//注意：两结点之间的路径长度是以它们之间边的数目表示。

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var maxDepth int

func diameterOfBinaryTree(root *TreeNode) int {
	maxDepth = 0
	dfs(root)
	return maxDepth
}

// 从root节点开始,到叶子节点最多节点个数
func dfs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	left := dfs(root.Left)
	right := dfs(root.Right)
	maxDepth = max(maxDepth, left+right)
	return max(left, right) + 1
}

func max(l, r int) int {
	if l > r {
		return l
	}
	return r
}
