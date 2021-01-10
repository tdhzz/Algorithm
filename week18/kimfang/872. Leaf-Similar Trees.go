package kimfang

import "fmt"

// 872. 叶子相似的树
//请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
//
//
//
//举个例子，如上图所示，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
//
//如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
//
//如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
//
//
//
//示例 1：
//
//
//
//输入：root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
//输出：true
//示例 2：
//
//输入：root1 = [1], root2 = [1]
//输出：true
//示例 3：
//
//输入：root1 = [1], root2 = [2]
//输出：false
//示例 4：
//
//输入：root1 = [1,2], root2 = [2,2]
//输出：true
//示例 5：
//
//
//
//输入：root1 = [1,2,3], root2 = [1,3,2]
//输出：false
//
//
//提示：
//
//给定的两棵树可能会有 1 到 200 个结点。
//给定的两棵树上的值介于 0 到 200 之间。
//通过次数21,388提交次数34,110



  type TreeNode struct {
      Val int
      Left *TreeNode
      Right *TreeNode
 }


func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	record1 := make([]int, 0)
	record1 = dfs(root1, record1)
	record2 := make([]int, 0)
	record2 = dfs(root2, record2)

	if len(record1) != len(record2) {
		return false
	}
	fmt.Printf("%+v,%+v", record1, record2)
	for idx, n := range record1 {
		if record2[idx] != n {
			return false
		}
	}
	return true
}

// 遍历一棵树的所有叶子节点
func dfs(root *TreeNode, records []int) []int {
	if root.Left == nil && root.Right == nil {
		return append(records, root.Val)
	}
	if root.Left != nil {
		records = dfs(root.Left, records)
	}
	if root.Right != nil {
		records = dfs(root.Right, records)
	}
	return records
}
