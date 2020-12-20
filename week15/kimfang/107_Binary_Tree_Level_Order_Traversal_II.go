package kimfang
//107. 二叉树的层次遍历 II
//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
//例如：
//给定二叉树 [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回其自底向上的层次遍历为：
//
//[
//  [15,7],
//  [9,20],
//  [3]
//]
//通过次数114,848提交次数169,277
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func levelOrderBottom(root *TreeNode) [][]int {
	if root == nil {
		return make([][]int, 0)
	}
	ret := make([][]int, 0, 16)
	queue := []*TreeNode{root}
	for len(queue) > 0 {
		size := len(queue)
		item := make([]int, size)
		for i:=0; i <size; i++ {
			item[i] = queue[i].Val
			if queue[i].Left != nil {
				queue = append(queue, queue[i].Left)
			}
			if queue[i].Right != nil {
				queue = append(queue, queue[i].Right)
			}
		}
		ret = append(ret, item)
		queue = queue[size:]
	}

	// reverse
	mid := len(ret) / 2
	end := len(ret)-1
	for i:=0; i < mid; i++ {
		tmp := ret[i]
		ret[i] = ret[end-i]
		ret[end-i] = tmp
	}
	return ret
}



 type TreeNode struct {
     Val int
     Left *TreeNode
     Right *TreeNode
 }
