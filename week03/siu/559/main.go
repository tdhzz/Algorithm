package main

type Node struct {
	Value    int
	Children []*Node
}

func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}

	depth := 0
	for _, child := range root.Children {
		depth = max(depth, maxDepth(child))
	}

	return depth + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}

	return b
}
