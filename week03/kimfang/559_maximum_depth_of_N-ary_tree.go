package kimfang

//给定一个 N 叉树，找到其最大深度。
//
//最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
//
//例如，给定一个 3叉树 :
//我们应返回其最大深度，3。
//
//说明:
//
//树的深度不会超过 1000。
//树的节点总不会超过 5000。

type Node struct {
	Val      int
	Children []*Node
}

func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}

	maxChildDepth := 0
	for _, child := range root.Children {
		maxChildDepth = max(maxDepth(child), maxChildDepth)
	}
	return maxChildDepth + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
