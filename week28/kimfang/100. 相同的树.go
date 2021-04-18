package kimfang


  type TreeNode struct {
      Val int
      Left *TreeNode
      Right *TreeNode
  }

func isSameTree(p *TreeNode, q *TreeNode) bool {
	if p == nil && q == nil {
		return true
	}
	if p == nil || q == nil || p.Val != q.Val {
		return false
	}
	return isSameTree(q.Left, p.Left) && isSameTree(q.Right, p.Right)
}
