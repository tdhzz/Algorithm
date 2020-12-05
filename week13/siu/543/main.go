package main

// DFS

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func diameterOfBinaryTree(root *TreeNode) int {
	maxSize := 0
	dfs(root, &maxSize)
	return maxSize
}

func dfs(node *TreeNode, maxSize *int) int {
	if node == nil {
		return 0
	}
	leftSize := dfs(node.Left, maxSize)
	rightSize := dfs(node.Right, maxSize)

	*maxSize = max(leftSize+rightSize, *maxSize)

	return max(leftSize, rightSize) + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
