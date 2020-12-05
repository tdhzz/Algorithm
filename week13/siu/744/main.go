package main

// 二分法

func nextGreatestLetter(letters []byte, target byte) byte {
	left, right := 0, len(letters)-1
	if letters[right] <= target {
		return letters[left]
	}
	for left < right {
		mid := (left + right) / 2
		if letters[mid] > target {
			right = mid
		} else {
			left = mid + 1
		}
	}
	return letters[left]
}
