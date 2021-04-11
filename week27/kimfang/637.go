package kimfang
// 637. 二叉树的层平均值
//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
//
//
//
//示例 1：
//
//输入：
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出：[3, 14.5, 11]
//解释：
//第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
//
//
//提示：
//
//节点值的范围在32位有符号整数范围内。
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func averageOfLevels(root *TreeNode) []float64 {
	if root == nil {
		return make([]float64, 0)
	}
	ret := make([]float64, 0, 4)
	queue := []*TreeNode{root}
	for len(queue) > 0 {
		sum := 0
		size := len(queue)
		for i := 0; i < size; i++ {
			sum += queue[i].Val
			if queue[i].Left != nil {
				queue = append(queue, queue[i].Left)
			}
			if queue[i].Right != nil {
				queue = append(queue, queue[i].Right)
			}
		}
		ret = append(ret, float64(sum)/float64(size))
		queue = queue[size:]
	}
	return ret
}


