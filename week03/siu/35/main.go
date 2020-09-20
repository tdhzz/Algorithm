package main

func main() {
	println(searchInsert([]int{1, 3, 5, 6}, 0))
}

func searchInsert(nums []int, target int) int {
	numsLen := len(nums)
	if numsLen == 0 {
		return 0
	}

	left := 0
	right := numsLen
	index := right

	for left < right {
		mid := left + (right-left)/2

		if target > nums[mid] {
			left = mid + 1
		} else {
			right = mid
			index = mid
		}
	}

	return index
}
