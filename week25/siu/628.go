package siu

import "sort"

func maximumProduct(nums []int) int {
	sort.Ints(nums)
	l := len(nums)
	return max(nums[l-1]*nums[l-2]*nums[l-3], nums[0]*nums[1]*nums[l-1])
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
