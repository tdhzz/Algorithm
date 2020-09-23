package main

import "fmt"

func main() {
	fmt.Println(sortArrayByParity([]int{3, 1, 2, 4}))
}

func sortArrayByParity(A []int) []int {
	length := len(A)
	if length == 0 {
		return A
	}

	left := 0
	right := length - 1
	for left < right {
		if A[left]%2 == 0 {
			left++
		} else if A[right]%2 != 0 {
			right--
		} else {
			A[left], A[right] = A[right], A[left]
			left++
			right--
		}
	}

	return A
}
