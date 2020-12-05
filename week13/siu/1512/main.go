package main

// 一个数在数组的好数对个数：count * (count - 1) / 2

func numIdenticalPairs(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	numMap := make(map[int]int)
	for _, v := range nums {
		numMap[v]++
	}

	count := 0
	for _, numCount := range numMap {
		count += numCount * (numCount - 1) / 2
	}
	return count
}
