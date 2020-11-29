package siu

func runningSum(nums []int) []int {
	if len(nums) == 1 {
		return nums
	}
	sum := nums[0]
	tmp := nums[1:]
	for i, num := range tmp {
		sum += num
		tmp[i] = sum
	}
	return nums
}
