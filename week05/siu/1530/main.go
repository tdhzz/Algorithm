package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func countPairs(root *TreeNode, distance int) int {
	ans, _ := doCountPairs(root, 0, distance)
	return ans
}

func doCountPairs(root *TreeNode, ans, distance int) (int, []int) {
	if root == nil {
		return ans, []int{}
	}
	if root.Left == nil && root.Right == nil {
		return ans, []int{1}
	}
	var ln, rn []int
	ans, ln = doCountPairs(root.Left, ans, distance)
	ans, rn = doCountPairs(root.Right, ans, distance)
	nodes := make([]int, 0)
	for i := 0; i < len(ln); i++ {
		nodes = append(nodes, ln[i]+1)
		for j := 0; j < len(rn); j++ {
			if ln[i]+rn[j] <= distance {
				ans++
			}
		}
	}
	for j := 0; j < len(rn); j++ {
		nodes = append(nodes, rn[j]+1)
	}
	return ans, nodes
}
