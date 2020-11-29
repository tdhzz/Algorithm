package siu

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sortedArrayToBST(nums []int) *TreeNode {
	if len(nums) == 0 {
		return nil
	}

	middle := len(nums) / 2
	left := nums[:middle]
	right := nums[middle+1:]

	return &TreeNode{
		Val:   nums[middle],
		Left:  sortedArrayToBST(left),
		Right: sortedArrayToBST(right),
	}

}
