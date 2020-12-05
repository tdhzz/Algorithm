package main

// ∵ sum = rightSum + i + leftSum
// ∵ rightSum == leftSum
// ∴ leftSum = sum - i - leftSum

func pivotIndex(nums []int) int {
	if len(nums) == 0 {
		return -1
	}
	sum := 0
	for _, v := range nums {
		sum += v
	}

	leftSum := 0
	for i := 0; i < len(nums); i++ {
		if leftSum == sum-leftSum-nums[i] {
			return i
		}
		leftSum += nums[i]
	}
	return -1
}
